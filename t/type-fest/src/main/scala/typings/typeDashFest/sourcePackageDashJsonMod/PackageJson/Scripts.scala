package typings.typeDashFest.sourcePackageDashJsonMod.PackageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripts extends /* scriptName */ StringDictionary[String] {
  /**
  		Run **after** the package is installed.
  		*/
  var install: js.UndefOr[String] = js.undefined
  /**
  		Run **after** the package is installed and after `install`.
  		*/
  var postinstall: js.UndefOr[String] = js.undefined
  /**
  		Run **after** the tarball has been generated and moved to its final destination.
  		*/
  var postpack: js.UndefOr[String] = js.undefined
  /**
  		Run **after** the package is published.
  		*/
  var postpublish: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var postrestart: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm start` command, after `start`.
  		*/
  var poststart: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm stop` command, after `stop`.
  		*/
  var poststop: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm test` command, after `test`.
  		*/
  var posttest: js.UndefOr[String] = js.undefined
  /**
  		Run **after** the package is uninstalled.
  		*/
  var postuninstall: js.UndefOr[String] = js.undefined
  /**
  		Run **after** bump the package version.
  		*/
  var postversion: js.UndefOr[String] = js.undefined
  /**
  		Run **before** the package is installed.
  		*/
  var preinstall: js.UndefOr[String] = js.undefined
  /**
  		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
  		*/
  var prepack: js.UndefOr[String] = js.undefined
  /**
  		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
  		*/
  var prepare: js.UndefOr[String] = js.undefined
  /**
  		Run **before** the package is published (Also run on local `npm install` without any arguments).
  		*/
  var prepublish: js.UndefOr[String] = js.undefined
  /**
  		Run **before** the package is prepared and packed, **only** on `npm publish`.
  		*/
  var prepublishOnly: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var prerestart: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm start` command, before `start`.
  		*/
  var prestart: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm stop` command, before `stop`.
  		*/
  var prestop: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm test` command, before `test`.
  		*/
  var pretest: js.UndefOr[String] = js.undefined
  /**
  		Run **before** the package is uninstalled and before `uninstall`.
  		*/
  var preuninstall: js.UndefOr[String] = js.undefined
  /**
  		Run **before** bump the package version and before `version`.
  		*/
  var preversion: js.UndefOr[String] = js.undefined
  /**
  		Run **after** the package is published.
  		*/
  var publish: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var restart: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm start` command.
  		*/
  var start: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm stop` command.
  		*/
  var stop: js.UndefOr[String] = js.undefined
  /**
  		Run with the `npm test` command.
  		*/
  var test: js.UndefOr[String] = js.undefined
  /**
  		Run **before** the package is uninstalled.
  		*/
  var uninstall: js.UndefOr[String] = js.undefined
  /**
  		Run **before** bump the package version.
  		*/
  var version: js.UndefOr[String] = js.undefined
}

object Scripts {
  @scala.inline
  def apply(
    StringDictionary: /* scriptName */ StringDictionary[String] = null,
    install: String = null,
    postinstall: String = null,
    postpack: String = null,
    postpublish: String = null,
    postrestart: String = null,
    poststart: String = null,
    poststop: String = null,
    posttest: String = null,
    postuninstall: String = null,
    postversion: String = null,
    preinstall: String = null,
    prepack: String = null,
    prepare: String = null,
    prepublish: String = null,
    prepublishOnly: String = null,
    prerestart: String = null,
    prestart: String = null,
    prestop: String = null,
    pretest: String = null,
    preuninstall: String = null,
    preversion: String = null,
    publish: String = null,
    restart: String = null,
    start: String = null,
    stop: String = null,
    test: String = null,
    uninstall: String = null,
    version: String = null
  ): Scripts = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (install != null) __obj.updateDynamic("install")(install)
    if (postinstall != null) __obj.updateDynamic("postinstall")(postinstall)
    if (postpack != null) __obj.updateDynamic("postpack")(postpack)
    if (postpublish != null) __obj.updateDynamic("postpublish")(postpublish)
    if (postrestart != null) __obj.updateDynamic("postrestart")(postrestart)
    if (poststart != null) __obj.updateDynamic("poststart")(poststart)
    if (poststop != null) __obj.updateDynamic("poststop")(poststop)
    if (posttest != null) __obj.updateDynamic("posttest")(posttest)
    if (postuninstall != null) __obj.updateDynamic("postuninstall")(postuninstall)
    if (postversion != null) __obj.updateDynamic("postversion")(postversion)
    if (preinstall != null) __obj.updateDynamic("preinstall")(preinstall)
    if (prepack != null) __obj.updateDynamic("prepack")(prepack)
    if (prepare != null) __obj.updateDynamic("prepare")(prepare)
    if (prepublish != null) __obj.updateDynamic("prepublish")(prepublish)
    if (prepublishOnly != null) __obj.updateDynamic("prepublishOnly")(prepublishOnly)
    if (prerestart != null) __obj.updateDynamic("prerestart")(prerestart)
    if (prestart != null) __obj.updateDynamic("prestart")(prestart)
    if (prestop != null) __obj.updateDynamic("prestop")(prestop)
    if (pretest != null) __obj.updateDynamic("pretest")(pretest)
    if (preuninstall != null) __obj.updateDynamic("preuninstall")(preuninstall)
    if (preversion != null) __obj.updateDynamic("preversion")(preversion)
    if (publish != null) __obj.updateDynamic("publish")(publish)
    if (restart != null) __obj.updateDynamic("restart")(restart)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (test != null) __obj.updateDynamic("test")(test)
    if (uninstall != null) __obj.updateDynamic("uninstall")(uninstall)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Scripts]
  }
}

