package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifier extends js.Object {
  
  /**
    * Gives lexical classifications of tokens on a line without any syntactic context.
    * For instance, a token consisting of the text 'string' can be either an identifier
    * named 'string' or the keyword 'string', however, because this classifier is not aware,
    * it relies on certain heuristics to give acceptable results. For classifications where
    * speed trumps accuracy, this function is preferable; however, for true accuracy, the
    * syntactic classifier is ideal. In fact, in certain editing scenarios, combining the
    * lexical, syntactic, and semantic classifiers may issue the best user experience.
    *
    * @param text                      The text of a line to classify.
    * @param lexState                  The state of the lexical classifier at the end of the previous line.
    * @param syntacticClassifierAbsent Whether the client is *not* using a syntactic classifier.
    *                                  If there is no syntactic classifier (syntacticClassifierAbsent=true),
    *                                  certain heuristics may be used in its place; however, if there is a
    *                                  syntactic classifier (syntacticClassifierAbsent=false), certain
    *                                  classifications which may be incorrectly categorized will be given
    *                                  back as Identifiers in order to allow the syntactic classifier to
    *                                  subsume the classification.
    * @deprecated Use getLexicalClassifications instead.
    */
  def getClassificationsForLine(text: java.lang.String, lexState: EndOfLineState, syntacticClassifierAbsent: Boolean): ClassificationResult = js.native
  
  def getEncodedLexicalClassifications(text: java.lang.String, endOfLineState: EndOfLineState, syntacticClassifierAbsent: Boolean): Classifications = js.native
}
object Classifier {
  
  @scala.inline
  def apply(
    getClassificationsForLine: (java.lang.String, EndOfLineState, Boolean) => ClassificationResult,
    getEncodedLexicalClassifications: (java.lang.String, EndOfLineState, Boolean) => Classifications
  ): Classifier = {
    val __obj = js.Dynamic.literal(getClassificationsForLine = js.Any.fromFunction3(getClassificationsForLine), getEncodedLexicalClassifications = js.Any.fromFunction3(getEncodedLexicalClassifications))
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetClassificationsForLine(value: (java.lang.String, EndOfLineState, Boolean) => ClassificationResult): Self = this.set("getClassificationsForLine", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetEncodedLexicalClassifications(value: (java.lang.String, EndOfLineState, Boolean) => Classifications): Self = this.set("getEncodedLexicalClassifications", js.Any.fromFunction3(value))
  }
}
