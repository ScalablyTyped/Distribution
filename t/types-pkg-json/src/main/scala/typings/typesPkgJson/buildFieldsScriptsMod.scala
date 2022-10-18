package typings.typesPkgJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFieldsScriptsMod {
  
  @js.native
  trait Scripts extends StObject {
    
    /**
      * Run **after** the package is installed.
      */
    var install: js.UndefOr[String] = js.native
    
    /**
      * Run **after** the package is installed and after `install`.
      */
    var postinstall: js.UndefOr[String] = js.native
    
    /**
      * Run **after** the tarball has been generated and moved to its final destination.
      */
    var postpack: js.UndefOr[String] = js.native
    
    /**
      * Run **after** the package is published.
      */
    var postpublish: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var postrestart: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm start` command, after `start`.
      */
    var poststart: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm stop` command, after `stop`.
      */
    var poststop: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm test` command, after `test`.
      */
    var posttest: js.UndefOr[String] = js.native
    
    /**
      * Run **after** the package is uninstalled.
      */
    var postuninstall: js.UndefOr[String] = js.native
    
    /**
      * Run **after** bump the package version.
      */
    var postversion: js.UndefOr[String] = js.native
    
    /**
      * Run **before** the package is installed.
      */
    var preinstall: js.UndefOr[String] = js.native
    
    /**
      * Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
      */
    var prepack: js.UndefOr[String] = js.native
    
    /**
      * Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
      */
    var prepare: js.UndefOr[String] = js.native
    
    /**
      * Run **before** the package is published (Also run on local `npm install` without any arguments).
      */
    var prepublish: js.UndefOr[String] = js.native
    
    /**
      * Run **before** the package is prepared and packed, **only** on `npm publish`.
      */
    var prepublishOnly: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var prerestart: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm start` command, before `start`.
      */
    var prestart: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm stop` command, before `stop`.
      */
    var prestop: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm test` command, before `test`.
      */
    var pretest: js.UndefOr[String] = js.native
    
    /**
      * Run **before** the package is uninstalled and before `uninstall`.
      */
    var preuninstall: js.UndefOr[String] = js.native
    
    /**
      * Run **before** bump the package version and before `version`.
      */
    var preversion: js.UndefOr[String] = js.native
    
    /**
      * Run **after** the package is published.
      */
    var publish: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var restart: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm start` command.
      */
    var start: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm stop` command.
      */
    var stop: js.UndefOr[String] = js.native
    
    /**
      * Run with the `npm test` command.
      */
    var test: js.UndefOr[String] = js.native
    
    /**
      * Run **before** the package is uninstalled.
      */
    var uninstall: js.UndefOr[String] = js.native
    
    /**
      * Run **before** bump the package version.
      */
    var version: js.UndefOr[String] = js.native
  }
}
