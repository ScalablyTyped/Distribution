package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining a single tokenizaion rule. */
@js.native
trait TokenDictRule extends js.Object {
  
  /** The part of speech that the `text` string belongs to. For example `noun`. Custom parts of speech can be specified. */
  var part_of_speech: String = js.native
  
  /** Array of tokens that represent the content of the `text` field in an alternate character set. */
  var readings: js.UndefOr[js.Array[String]] = js.native
  
  /** The string to tokenize. */
  var text: String = js.native
  
  /** Array of tokens that the `text` field is split into when found. */
  var tokens: js.Array[String] = js.native
}
object TokenDictRule {
  
  @scala.inline
  def apply(part_of_speech: String, text: String, tokens: js.Array[String]): TokenDictRule = {
    val __obj = js.Dynamic.literal(part_of_speech = part_of_speech.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDictRule]
  }
  
  @scala.inline
  implicit class TokenDictRuleOps[Self <: TokenDictRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPart_of_speech(value: String): Self = this.set("part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: String*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[String]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingsVarargs(value: String*): Self = this.set("readings", js.Array(value :_*))
    
    @scala.inline
    def setReadings(value: js.Array[String]): Self = this.set("readings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadings: Self = this.set("readings", js.undefined)
  }
}
