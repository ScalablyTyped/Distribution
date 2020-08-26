package typings.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryLocations
  extends /* key */ StringDictionary[js.Any] {
  /**
  		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
  		*/
  var bin: js.UndefOr[String] = js.native
  /**
  		Location for Markdown files.
  		*/
  var doc: js.UndefOr[String] = js.native
  /**
  		Location for example scripts.
  		*/
  var example: js.UndefOr[String] = js.native
  /**
  		Location for the bulk of the library.
  		*/
  var lib: js.UndefOr[String] = js.native
  /**
  		Location for man pages. Sugar to generate a `man` array by walking the folder.
  		*/
  var man: js.UndefOr[String] = js.native
  /**
  		Location for test files.
  		*/
  var test: js.UndefOr[String] = js.native
}

object DirectoryLocations {
  @scala.inline
  def apply(): DirectoryLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryLocations]
  }
  @scala.inline
  implicit class DirectoryLocationsOps[Self <: DirectoryLocations] (val x: Self) extends AnyVal {
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    @scala.inline
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    @scala.inline
    def setExample(value: String): Self = this.set("example", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    @scala.inline
    def setLib(value: String): Self = this.set("lib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    @scala.inline
    def setMan(value: String): Self = this.set("man", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMan: Self = this.set("man", js.undefined)
    @scala.inline
    def setTest(value: String): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

