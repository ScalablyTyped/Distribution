package typings.writePkg

import typings.typeFest.basicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: JsonObject): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(data: JsonObject, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
  	Write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	(async () => {
  		await writePackage({foo: true});
  		console.log('done');
  		await writePackage(__dirname, {foo: true});
  		console.log('done');
  		await writePackage(path.join('unicorn', 'package.json'), {foo: true});
  		console.log('done');
  	})();
  	```
  	*/
  inline def apply(path: String, data: JsonObject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(path: String, data: JsonObject, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(data: JsonObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sync(data: JsonObject, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
  	Synchronously write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	writePackage.sync({foo: true});
  	console.log('done');
  	writePackage.sync(__dirname, {foo: true});
  	console.log('done');
  	writePackage.sync(path.join('unicorn', 'package.json'), {foo: true});
  	console.log('done');
  	```
  	*/
  inline def sync(path: String, data: JsonObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(path: String, data: JsonObject, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		Remove empty `dependencies`, `devDependencies`, `optionalDependencies` and `peerDependencies` objects.
    		@default true
    		*/
    val normalize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
