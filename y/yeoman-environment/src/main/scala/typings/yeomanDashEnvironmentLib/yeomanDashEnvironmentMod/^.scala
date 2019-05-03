package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
class ^[O /* <: Options */] () extends Environment[O] {
  def this(args: java.lang.String) = this()
  def this(args: js.Array[java.lang.String]) = this()
  def this(args: java.lang.String, opts: O) = this()
  def this(args: js.Array[java.lang.String], opts: O) = this()
  def this(args: java.lang.String, opts: O, adapter: Adapter) = this()
  def this(args: js.Array[java.lang.String], opts: O, adapter: Adapter) = this()
}

@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createEnv[O /* <: Options */](): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: java.lang.String): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: java.lang.String, opts: O): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: java.lang.String, opts: O, adapter: Adapter): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[java.lang.String]): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[java.lang.String], opts: O): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[java.lang.String], opts: O, adapter: Adapter): Environment[O] = js.native
  def enforceUpdate[E /* <: Environment[Options] */](env: E): E = js.native
  def namespaceToName(namespace: java.lang.String): java.lang.String = js.native
}

