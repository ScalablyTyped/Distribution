package typings
package typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripts
  extends /* scriptName */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  /**
  		Run **after** the package is installed.
  		*/
  var install: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** the package is installed and after `install`.
  		*/
  var postinstall: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** the tarball has been generated and moved to its final destination.
  		*/
  var postpack: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** the package is published.
  		*/
  var postpublish: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var postrestart: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm start` command, after `start`.
  		*/
  var poststart: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm stop` command, after `stop`.
  		*/
  var poststop: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm test` command, after `test`.
  		*/
  var posttest: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** the package is uninstalled.
  		*/
  var postuninstall: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** bump the package version.
  		*/
  var postversion: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** the package is installed.
  		*/
  var preinstall: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
  		*/
  var prepack: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
  		*/
  var prepare: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** the package is published (Also run on local `npm install` without any arguments).
  		*/
  var prepublish: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** the package is prepared and packed, **only** on `npm publish`.
  		*/
  var prepublishOnly: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var prerestart: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm start` command, before `start`.
  		*/
  var prestart: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm stop` command, before `stop`.
  		*/
  var prestop: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm test` command, before `test`.
  		*/
  var pretest: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** the package is uninstalled and before `uninstall`.
  		*/
  var preuninstall: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** bump the package version and before `version`.
  		*/
  var preversion: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **after** the package is published.
  		*/
  var publish: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
  		*/
  var restart: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm start` command.
  		*/
  var start: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm stop` command.
  		*/
  var stop: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run with the `npm test` command.
  		*/
  var test: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** the package is uninstalled.
  		*/
  var uninstall: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Run **before** bump the package version.
  		*/
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Scripts {
  @scala.inline
  def apply(
    StringDictionary: /* scriptName */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    install: java.lang.String = null,
    postinstall: java.lang.String = null,
    postpack: java.lang.String = null,
    postpublish: java.lang.String = null,
    postrestart: java.lang.String = null,
    poststart: java.lang.String = null,
    poststop: java.lang.String = null,
    posttest: java.lang.String = null,
    postuninstall: java.lang.String = null,
    postversion: java.lang.String = null,
    preinstall: java.lang.String = null,
    prepack: java.lang.String = null,
    prepare: java.lang.String = null,
    prepublish: java.lang.String = null,
    prepublishOnly: java.lang.String = null,
    prerestart: java.lang.String = null,
    prestart: java.lang.String = null,
    prestop: java.lang.String = null,
    pretest: java.lang.String = null,
    preuninstall: java.lang.String = null,
    preversion: java.lang.String = null,
    publish: java.lang.String = null,
    restart: java.lang.String = null,
    start: java.lang.String = null,
    stop: java.lang.String = null,
    test: java.lang.String = null,
    uninstall: java.lang.String = null,
    version: java.lang.String = null
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

