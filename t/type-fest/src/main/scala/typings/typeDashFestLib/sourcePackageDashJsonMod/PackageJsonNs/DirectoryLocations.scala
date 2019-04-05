package typings
package typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryLocations
  extends /* directoryType */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
  		*/
  var bin: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location for Markdown files.
  		*/
  var doc: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location for example scripts.
  		*/
  var example: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location for the bulk of the library.
  		*/
  var lib: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location for man pages. Sugar to generate a `man` array by walking the folder.
  		*/
  var man: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location for test files.
  		*/
  var test: js.UndefOr[java.lang.String] = js.undefined
}

object DirectoryLocations {
  @scala.inline
  def apply(
    StringDictionary: /* directoryType */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bin: java.lang.String = null,
    doc: java.lang.String = null,
    example: java.lang.String = null,
    lib: java.lang.String = null,
    man: java.lang.String = null,
    test: java.lang.String = null
  ): DirectoryLocations = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (example != null) __obj.updateDynamic("example")(example)
    if (lib != null) __obj.updateDynamic("lib")(lib)
    if (man != null) __obj.updateDynamic("man")(man)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[DirectoryLocations]
  }
}

