package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scss extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String = js.native
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var sass: String = js.native
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var scss: String = js.native
}

object Scss {
  @scala.inline
  def apply(css: String, sass: String, scss: String): Scss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scss]
  }
  @scala.inline
  implicit class ScssOps[Self <: Scss] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setSass(value: String): Self = this.set("sass", value.asInstanceOf[js.Any])
    @scala.inline
    def setScss(value: String): Self = this.set("scss", value.asInstanceOf[js.Any])
  }
  
}

