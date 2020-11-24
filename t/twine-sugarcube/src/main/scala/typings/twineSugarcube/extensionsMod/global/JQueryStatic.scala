package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  /**
    * Wikifies the given content source(s) and discards the result. If there were errors, an exception is thrown. This is only
    * really useful when you want to invoke a macro for its side-effects and aren't interested in its output.
    * @param sources The list of content sources.
    * @since 2.17.0
    * @example
    * $.wiki('<<somemacro>>'); // Invokes the <<somemacro>> macro, discarding any output
    */
  def wiki(sources: java.lang.String*): Unit = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(wiki: /* repeated */ java.lang.String => Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(wiki = js.Any.fromFunction1(wiki))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
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
    def setWiki(value: /* repeated */ java.lang.String => Unit): Self = this.set("wiki", js.Any.fromFunction1(value))
  }
}
