package typings.typesEslintrc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEnvironmentMod {
  
  trait ESLintEnvironment
    extends StObject
       with /* custom */ StringDictionary[js.UndefOr[Boolean]] {
    
    /**
      * Defines require() and define() as global variables as per the amd spec.
      */
    var amd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * AppleScript global variables.
      */
    var applescript: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Atom test helper globals.
      */
    var atomtest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Browser global variables.
      */
    var browser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CommonJS global variables and CommonJS scoping (use this for browser-only code that uses Browserify/WebPack).
      */
    var commonjs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ember test helper globals.
      */
    var embertest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all ECMAScript 2017 globals and automatically sets the ecmaVersion parser option to 8.
      */
    var es2017: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all ECMAScript 2020 globals and automatically sets the ecmaVersion parser option to 11.
      */
    var es2020: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all ECMAScript 2021 globals and automatically sets the ecmaVersion parser option to 12.
      */
    var es2021: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable all ECMAScript 6 features except for modules (this automatically sets the ecmaVersion parser option to 6).
      */
    var es6: js.UndefOr[Boolean] = js.undefined
    
    /**
      * GreaseMonkey globals.
      */
    var greasemonkey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all of the Jasmine testing global variables for version 1.3 and 2.0.
      */
    var jasmine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Jest global variables.
      */
    var jest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * jQuery global variables.
      */
    var jquery: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Meteor global variables.
      */
    var meteor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all of the Mocha testing global variables.
      */
    var mocha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Meteor global variables.
      */
    var mongo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Java 8 Nashorn global variables.
      */
    var nashorn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Node.js global variables and Node.js scoping.
      */
    var node: js.UndefOr[Boolean] = js.undefined
    
    /**
      * PhantomJS global variables.
      */
    var phantomjs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prototype.js global variables.
      */
    var prototypejs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Protractor global variables.
      */
    var protractor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * QUnit global variables.
      */
    var qunit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Service Worker global variables.
      */
    var serviceworker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Globals common to both Node.js and Browser.
      */
    var `shared-node-browser`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ShellJS global variables.
      */
    var shelljs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * WebExtensions globals.
      */
    var webextensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Web workers global variables.
      */
    var worker: js.UndefOr[Boolean] = js.undefined
  }
  object ESLintEnvironment {
    
    inline def apply(): ESLintEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESLintEnvironment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ESLintEnvironment] (val x: Self) extends AnyVal {
      
      inline def setAmd(value: Boolean): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
      
      inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
      
      inline def setApplescript(value: Boolean): Self = StObject.set(x, "applescript", value.asInstanceOf[js.Any])
      
      inline def setApplescriptUndefined: Self = StObject.set(x, "applescript", js.undefined)
      
      inline def setAtomtest(value: Boolean): Self = StObject.set(x, "atomtest", value.asInstanceOf[js.Any])
      
      inline def setAtomtestUndefined: Self = StObject.set(x, "atomtest", js.undefined)
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setCommonjs(value: Boolean): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
      
      inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
      
      inline def setEmbertest(value: Boolean): Self = StObject.set(x, "embertest", value.asInstanceOf[js.Any])
      
      inline def setEmbertestUndefined: Self = StObject.set(x, "embertest", js.undefined)
      
      inline def setEs2017(value: Boolean): Self = StObject.set(x, "es2017", value.asInstanceOf[js.Any])
      
      inline def setEs2017Undefined: Self = StObject.set(x, "es2017", js.undefined)
      
      inline def setEs2020(value: Boolean): Self = StObject.set(x, "es2020", value.asInstanceOf[js.Any])
      
      inline def setEs2020Undefined: Self = StObject.set(x, "es2020", js.undefined)
      
      inline def setEs2021(value: Boolean): Self = StObject.set(x, "es2021", value.asInstanceOf[js.Any])
      
      inline def setEs2021Undefined: Self = StObject.set(x, "es2021", js.undefined)
      
      inline def setEs6(value: Boolean): Self = StObject.set(x, "es6", value.asInstanceOf[js.Any])
      
      inline def setEs6Undefined: Self = StObject.set(x, "es6", js.undefined)
      
      inline def setGreasemonkey(value: Boolean): Self = StObject.set(x, "greasemonkey", value.asInstanceOf[js.Any])
      
      inline def setGreasemonkeyUndefined: Self = StObject.set(x, "greasemonkey", js.undefined)
      
      inline def setJasmine(value: Boolean): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
      
      inline def setJasmineUndefined: Self = StObject.set(x, "jasmine", js.undefined)
      
      inline def setJest(value: Boolean): Self = StObject.set(x, "jest", value.asInstanceOf[js.Any])
      
      inline def setJestUndefined: Self = StObject.set(x, "jest", js.undefined)
      
      inline def setJquery(value: Boolean): Self = StObject.set(x, "jquery", value.asInstanceOf[js.Any])
      
      inline def setJqueryUndefined: Self = StObject.set(x, "jquery", js.undefined)
      
      inline def setMeteor(value: Boolean): Self = StObject.set(x, "meteor", value.asInstanceOf[js.Any])
      
      inline def setMeteorUndefined: Self = StObject.set(x, "meteor", js.undefined)
      
      inline def setMocha(value: Boolean): Self = StObject.set(x, "mocha", value.asInstanceOf[js.Any])
      
      inline def setMochaUndefined: Self = StObject.set(x, "mocha", js.undefined)
      
      inline def setMongo(value: Boolean): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      
      inline def setMongoUndefined: Self = StObject.set(x, "mongo", js.undefined)
      
      inline def setNashorn(value: Boolean): Self = StObject.set(x, "nashorn", value.asInstanceOf[js.Any])
      
      inline def setNashornUndefined: Self = StObject.set(x, "nashorn", js.undefined)
      
      inline def setNode(value: Boolean): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPhantomjs(value: Boolean): Self = StObject.set(x, "phantomjs", value.asInstanceOf[js.Any])
      
      inline def setPhantomjsUndefined: Self = StObject.set(x, "phantomjs", js.undefined)
      
      inline def setPrototypejs(value: Boolean): Self = StObject.set(x, "prototypejs", value.asInstanceOf[js.Any])
      
      inline def setPrototypejsUndefined: Self = StObject.set(x, "prototypejs", js.undefined)
      
      inline def setProtractor(value: Boolean): Self = StObject.set(x, "protractor", value.asInstanceOf[js.Any])
      
      inline def setProtractorUndefined: Self = StObject.set(x, "protractor", js.undefined)
      
      inline def setQunit(value: Boolean): Self = StObject.set(x, "qunit", value.asInstanceOf[js.Any])
      
      inline def setQunitUndefined: Self = StObject.set(x, "qunit", js.undefined)
      
      inline def setServiceworker(value: Boolean): Self = StObject.set(x, "serviceworker", value.asInstanceOf[js.Any])
      
      inline def setServiceworkerUndefined: Self = StObject.set(x, "serviceworker", js.undefined)
      
      inline def `setShared-node-browser`(value: Boolean): Self = StObject.set(x, "shared-node-browser", value.asInstanceOf[js.Any])
      
      inline def `setShared-node-browserUndefined`: Self = StObject.set(x, "shared-node-browser", js.undefined)
      
      inline def setShelljs(value: Boolean): Self = StObject.set(x, "shelljs", value.asInstanceOf[js.Any])
      
      inline def setShelljsUndefined: Self = StObject.set(x, "shelljs", js.undefined)
      
      inline def setWebextensions(value: Boolean): Self = StObject.set(x, "webextensions", value.asInstanceOf[js.Any])
      
      inline def setWebextensionsUndefined: Self = StObject.set(x, "webextensions", js.undefined)
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
}
