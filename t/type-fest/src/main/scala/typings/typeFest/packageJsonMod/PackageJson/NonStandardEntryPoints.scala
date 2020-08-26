package typings.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.typeFest.anon.DictmoduleName
import typings.typeFest.typeFestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonStandardEntryPoints extends js.Object {
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.native
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[String | DictmoduleName] = js.native
  /**
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[String] = js.native
}

object NonStandardEntryPoints {
  @scala.inline
  def apply(): NonStandardEntryPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonStandardEntryPoints]
  }
  @scala.inline
  implicit class NonStandardEntryPointsOps[Self <: NonStandardEntryPoints] (val x: Self) extends AnyVal {
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
    def setBrowser(value: String | (StringDictionary[String | `false`])): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setEsnext(value: String | DictmoduleName): Self = this.set("esnext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsnext: Self = this.set("esnext", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
  
}

