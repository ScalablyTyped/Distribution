package typings.typeFest.packageJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scripts extends /* scriptName */ StringDictionary[String] {
  
  /**
  		Run **after** the package is installed.
  		*/
  var install: js.UndefOr[String] = js.native
  
  /**
  		Run **after** the package is installed and after `install`.
  		*/
  var postinstall: js.UndefOr[String] = js.native
  
  /**
  		Run **after** the tarball has been generated and moved to its final destination.
  		*/
  var postpack: js.UndefOr[String] = js.native
  
  /**
  		Run **after** the package is published.
  		*/
  var postpublish: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var postrestart: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm start` command, after `start`.
  		*/
  var poststart: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm stop` command, after `stop`.
  		*/
  var poststop: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm test` command, after `test`.
  		*/
  var posttest: js.UndefOr[String] = js.native
  
  /**
  		Run **after** the package is uninstalled.
  		*/
  var postuninstall: js.UndefOr[String] = js.native
  
  /**
  		Run **after** bump the package version.
  		*/
  var postversion: js.UndefOr[String] = js.native
  
  /**
  		Run **before** the package is installed.
  		*/
  var preinstall: js.UndefOr[String] = js.native
  
  /**
  		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
  		*/
  var prepack: js.UndefOr[String] = js.native
  
  /**
  		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
  		*/
  var prepare: js.UndefOr[String] = js.native
  
  /**
  		Run **before** the package is published (Also run on local `npm install` without any arguments).
  		*/
  var prepublish: js.UndefOr[String] = js.native
  
  /**
  		Run **before** the package is prepared and packed, **only** on `npm publish`.
  		*/
  var prepublishOnly: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var prerestart: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm start` command, before `start`.
  		*/
  var prestart: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm stop` command, before `stop`.
  		*/
  var prestop: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm test` command, before `test`.
  		*/
  var pretest: js.UndefOr[String] = js.native
  
  /**
  		Run **before** the package is uninstalled and before `uninstall`.
  		*/
  var preuninstall: js.UndefOr[String] = js.native
  
  /**
  		Run **before** bump the package version and before `version`.
  		*/
  var preversion: js.UndefOr[String] = js.native
  
  /**
  		Run **after** the package is published.
  		*/
  var publish: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var restart: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm start` command.
  		*/
  var start: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm stop` command.
  		*/
  var stop: js.UndefOr[String] = js.native
  
  /**
  		Run with the `npm test` command.
  		*/
  var test: js.UndefOr[String] = js.native
  
  /**
  		Run **before** the package is uninstalled.
  		*/
  var uninstall: js.UndefOr[String] = js.native
  
  /**
  		Run **before** bump the package version.
  		*/
  var version: js.UndefOr[String] = js.native
}
object Scripts {
  
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  @scala.inline
  implicit class ScriptsOps[Self <: Scripts] (val x: Self) extends AnyVal {
    
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
    def setInstall(value: String): Self = this.set("install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstall: Self = this.set("install", js.undefined)
    
    @scala.inline
    def setPostinstall(value: String): Self = this.set("postinstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostinstall: Self = this.set("postinstall", js.undefined)
    
    @scala.inline
    def setPostpack(value: String): Self = this.set("postpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostpack: Self = this.set("postpack", js.undefined)
    
    @scala.inline
    def setPostpublish(value: String): Self = this.set("postpublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostpublish: Self = this.set("postpublish", js.undefined)
    
    @scala.inline
    def setPostrestart(value: String): Self = this.set("postrestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostrestart: Self = this.set("postrestart", js.undefined)
    
    @scala.inline
    def setPoststart(value: String): Self = this.set("poststart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoststart: Self = this.set("poststart", js.undefined)
    
    @scala.inline
    def setPoststop(value: String): Self = this.set("poststop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoststop: Self = this.set("poststop", js.undefined)
    
    @scala.inline
    def setPosttest(value: String): Self = this.set("posttest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosttest: Self = this.set("posttest", js.undefined)
    
    @scala.inline
    def setPostuninstall(value: String): Self = this.set("postuninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostuninstall: Self = this.set("postuninstall", js.undefined)
    
    @scala.inline
    def setPostversion(value: String): Self = this.set("postversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostversion: Self = this.set("postversion", js.undefined)
    
    @scala.inline
    def setPreinstall(value: String): Self = this.set("preinstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreinstall: Self = this.set("preinstall", js.undefined)
    
    @scala.inline
    def setPrepack(value: String): Self = this.set("prepack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepack: Self = this.set("prepack", js.undefined)
    
    @scala.inline
    def setPrepare(value: String): Self = this.set("prepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    
    @scala.inline
    def setPrepublish(value: String): Self = this.set("prepublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepublish: Self = this.set("prepublish", js.undefined)
    
    @scala.inline
    def setPrepublishOnly(value: String): Self = this.set("prepublishOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepublishOnly: Self = this.set("prepublishOnly", js.undefined)
    
    @scala.inline
    def setPrerestart(value: String): Self = this.set("prerestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerestart: Self = this.set("prerestart", js.undefined)
    
    @scala.inline
    def setPrestart(value: String): Self = this.set("prestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrestart: Self = this.set("prestart", js.undefined)
    
    @scala.inline
    def setPrestop(value: String): Self = this.set("prestop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrestop: Self = this.set("prestop", js.undefined)
    
    @scala.inline
    def setPretest(value: String): Self = this.set("pretest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretest: Self = this.set("pretest", js.undefined)
    
    @scala.inline
    def setPreuninstall(value: String): Self = this.set("preuninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreuninstall: Self = this.set("preuninstall", js.undefined)
    
    @scala.inline
    def setPreversion(value: String): Self = this.set("preversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreversion: Self = this.set("preversion", js.undefined)
    
    @scala.inline
    def setPublish(value: String): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublish: Self = this.set("publish", js.undefined)
    
    @scala.inline
    def setRestart(value: String): Self = this.set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: String): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setTest(value: String): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setUninstall(value: String): Self = this.set("uninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstall: Self = this.set("uninstall", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
