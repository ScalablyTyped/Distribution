package typings.tempy

import typings.typeDashFest.typeDashFestMod.MergeExclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tempy", JSImport.Namespace)
@js.native
object tempyMod extends js.Object {
  /**
  	Get the root temporary directory path. For example: `/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T`.
  	*/
  val root: String = js.native
  /**
  	Get a temporary directory path. The directory is created for you.
  	@example
  	```
  	import tempy = require('tempy');
  	tempy.directory();
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  	```
  	*/
  def directory(): String = js.native
  /**
  	Get a temporary file path you can write to.
  	@example
  	```
  	import tempy = require('tempy');
  	tempy.file();
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/4f504b9edb5ba0e89451617bf9f971dd'
  	tempy.file({extension: 'png'});
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/a9fb0decd08179eb6cf4691568aa2018.png'
  	tempy.file({name: 'unicorn.png'});
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/f7f62bfd4e2a05f1589947647ed3f9ec/unicorn.png'
  	tempy.directory();
  	//=> '/private/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/2f3d094aec2cb1b93bb0f4cffce5ebd6'
  	```
  	*/
  def file(): String = js.native
  def file(options: Options): String = js.native
  type Options = MergeExclusive[Anon_Extension, Anon_Name]
}

