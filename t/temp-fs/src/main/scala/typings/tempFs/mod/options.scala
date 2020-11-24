package typings.tempFs.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options.
  */
@js.native
trait options extends js.Object {
  
  /**
    * Where to put the generated tempfile or tempdir.
    *
    * Also see {@link options#name}. Default: <code>tempfs.dir()</code>
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of chance to retry before throwing an error.
    *
    * It should be a finite number. Default: 5
    */
  var limit: js.UndefOr[Number] = js.native
  
  /**
    * File mode (default: 0600) or directory mode (default: 0700) to use.
    */
  var mode: js.UndefOr[Number] = js.native
  
  /**
    * If set, join the two paths <code>{@link options#dir} ||
    * tempfs.dir()</code> and {@link options#name} together and use the
    * result as the customized filename/pathname.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The prefix for the generated random name.
    *
    * Default: "tmp-"
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Whether {@link dir#unlink} should remove a directory recursively.
    *
    * Default: false
    */
  var recursive: js.UndefOr[Boolean] = js.native
  
  /**
    * The suffix for the generated random name.
    *
    * Default: ""
    */
  var suffix: js.UndefOr[String] = js.native
  
  /**
    * A string containing some capital letters Xs for substitution with
    * random characters.
    *
    * Then it is used as part of the filename/dirname. Just like what you
    * do with the <code>mktemp(3)</code> function in the C library.
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * If set to true, let temp-fs manage the the current file/directory for
    * you even if the global tracking is off. If set to false, don't let
    * temp-fs manage it even if the global tracking is on. Otherwise, use
    * the current global setting.
    */
  var track: js.UndefOr[Boolean] = js.native
}
object options {
  
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setLimit(value: Number): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMode(value: Number): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
}
