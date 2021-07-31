package typings.writeJsonFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	(async () => {
  		await writeJsonFile('foo.json', {foo: true});
  	})();
  	```
  	*/
  @scala.inline
  def apply(filePath: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(filePath: String, data: js.Any, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("write-json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Stringify and write JSON to a file atomically.
  	Creates directories for you as needed.
  	@example
  	```
  	import writeJsonFile = require('write-json-file');
  	writeJsonFile.sync('foo.json', {foo: true});
  	```
  	*/
  @scala.inline
  def sync(filePath: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sync(filePath: String, data: js.Any, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		Detect indentation automatically if the file exists.
    		@default false
    		*/
    val detectIndent: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Indentation as a string or number of spaces. Pass in `undefined` for no formatting.
    		@default '\t'
    		*/
    val indent: js.UndefOr[String | Double] = js.undefined
    
    /**
    		Mode used when writing the file.
    		@default 0o666
    		*/
    val mode: js.UndefOr[Double] = js.undefined
    
    /**
    		Passed into `JSON.stringify`.
    		*/
    val replacer: js.UndefOr[Replacer | (js.Array[Double | String])] = js.undefined
    
    /**
    		Sort the keys recursively. Optionally pass in a compare function.
    		@default false
    		*/
    val sortKeys: js.UndefOr[Boolean | SortKeys] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectIndent(value: Boolean): Self = StObject.set(x, "detectIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectIndentUndefined: Self = StObject.set(x, "detectIndent", js.undefined)
      
      @scala.inline
      def setIndent(value: String | Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setReplacer(value: Replacer | (js.Array[Double | String])): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value :_*))
      
      @scala.inline
      def setSortKeys(value: Boolean | SortKeys): Self = StObject.set(x, "sortKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeysFunction2(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "sortKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortKeysUndefined: Self = StObject.set(x, "sortKeys", js.undefined)
    }
  }
  
  type Replacer = js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
  
  type SortKeys = js.Function2[/* a */ String, /* b */ String, Double]
}
