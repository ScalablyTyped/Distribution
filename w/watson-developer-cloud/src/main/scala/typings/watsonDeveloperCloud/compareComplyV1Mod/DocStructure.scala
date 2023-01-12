package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The structure of the input document. */
trait DocStructure extends StObject {
  
  /** An array containing one object per section or subsection, in parallel with the `section_titles` array, that details the leading sentences in the corresponding section or subsection. */
  var leading_sentences: js.UndefOr[js.Array[LeadingSentence]] = js.undefined
  
  /** An array containing one object per section or subsection identified in the input document. */
  var section_titles: js.UndefOr[js.Array[SectionTitles]] = js.undefined
}
object DocStructure {
  
  inline def apply(): DocStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocStructure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocStructure] (val x: Self) extends AnyVal {
    
    inline def setLeading_sentences(value: js.Array[LeadingSentence]): Self = StObject.set(x, "leading_sentences", value.asInstanceOf[js.Any])
    
    inline def setLeading_sentencesUndefined: Self = StObject.set(x, "leading_sentences", js.undefined)
    
    inline def setLeading_sentencesVarargs(value: LeadingSentence*): Self = StObject.set(x, "leading_sentences", js.Array(value*))
    
    inline def setSection_titles(value: js.Array[SectionTitles]): Self = StObject.set(x, "section_titles", value.asInstanceOf[js.Any])
    
    inline def setSection_titlesUndefined: Self = StObject.set(x, "section_titles", js.undefined)
    
    inline def setSection_titlesVarargs(value: SectionTitles*): Self = StObject.set(x, "section_titles", js.Array(value*))
  }
}
