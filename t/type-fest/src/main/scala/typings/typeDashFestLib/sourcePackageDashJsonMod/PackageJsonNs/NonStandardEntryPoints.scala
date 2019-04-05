package typings
package typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonStandardEntryPoints extends js.Object {
  /**
  		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
  		*/
  var browser: js.UndefOr[
    java.lang.String | (org.scalablytyped.runtime.StringDictionary[java.lang.String | typeDashFestLib.typeDashFestLibNumbers.`false`])
  ] = js.undefined
  /**
  		A module ID with untranspiled code that is the primary entry point to the program.
  		*/
  var esnext: js.UndefOr[java.lang.String | typeDashFestLib.Anon_Browser] = js.undefined
  /**
  		An ECMAScript module ID that is the primary entry point to the program.
  		*/
  var module: js.UndefOr[java.lang.String] = js.undefined
}

object NonStandardEntryPoints {
  @scala.inline
  def apply(
    browser: java.lang.String | (org.scalablytyped.runtime.StringDictionary[java.lang.String | typeDashFestLib.typeDashFestLibNumbers.`false`]) = null,
    esnext: java.lang.String | typeDashFestLib.Anon_Browser = null,
    module: java.lang.String = null
  ): NonStandardEntryPoints = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (esnext != null) __obj.updateDynamic("esnext")(esnext.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[NonStandardEntryPoints]
  }
}

