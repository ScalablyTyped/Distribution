package typings.typeDashFest.sourcePackageDashJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryLocations
  extends /* directoryType */ StringDictionary[js.Any] {
  /**
  		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
  		*/
  var bin: js.UndefOr[String] = js.undefined
  /**
  		Location for Markdown files.
  		*/
  var doc: js.UndefOr[String] = js.undefined
  /**
  		Location for example scripts.
  		*/
  var example: js.UndefOr[String] = js.undefined
  /**
  		Location for the bulk of the library.
  		*/
  var lib: js.UndefOr[String] = js.undefined
  /**
  		Location for man pages. Sugar to generate a `man` array by walking the folder.
  		*/
  var man: js.UndefOr[String] = js.undefined
  /**
  		Location for test files.
  		*/
  var test: js.UndefOr[String] = js.undefined
}

object DirectoryLocations {
  @scala.inline
  def apply(
    StringDictionary: /* directoryType */ StringDictionary[js.Any] = null,
    bin: String = null,
    doc: String = null,
    example: String = null,
    lib: String = null,
    man: String = null,
    test: String = null
  ): DirectoryLocations = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib.asInstanceOf[js.Any])
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryLocations]
  }
}

