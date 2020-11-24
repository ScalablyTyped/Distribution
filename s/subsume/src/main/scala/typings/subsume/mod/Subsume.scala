package typings.subsume.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subsume extends js.Object {
  
  /**
  	@returns A wrapped version of `text` that you can embed in other content.
  	*/
  def compose(string: String): String = js.native
  
  /**
  	Used identifier.
  	*/
  var id: String = js.native
  
  /**
  	Extract your embedded data from `text`.
  	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
  	*/
  def parse(string: String): ParseResult = js.native
  
  /**
  	Postfix used in `.compose()`.
  	*/
  var postfix: String = js.native
  
  /**
  	Prefix used in `.compose()`.
  	*/
  var prefix: String = js.native
  
  /**
  	Regex used in `.parse()`.
  	*/
  var regex: RegExp = js.native
}
object Subsume {
  
  @scala.inline
  def apply(
    compose: String => String,
    id: String,
    parse: String => ParseResult,
    postfix: String,
    prefix: String,
    regex: RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subsume]
  }
  
  @scala.inline
  implicit class SubsumeOps[Self <: Subsume] (val x: Self) extends AnyVal {
    
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
    def setCompose(value: String => String): Self = this.set("compose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: String => ParseResult): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
