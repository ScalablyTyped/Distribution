package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
class ^[O /* <: Options */] () extends Environment[O] {
  def this(args: String) = this()
  def this(args: js.Array[String]) = this()
  def this(args: String, opts: O) = this()
  def this(args: js.Array[String], opts: O) = this()
  def this(args: String, opts: O, adapter: Adapter) = this()
  def this(args: js.Array[String], opts: O, adapter: Adapter) = this()
}

@JSImport("yeoman-environment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createEnv[O /* <: Options */](): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: String): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: String, opts: O): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: String, opts: O, adapter: Adapter): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[String]): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[String], opts: O): Environment[O] = js.native
  def createEnv[O /* <: Options */](args: js.Array[String], opts: O, adapter: Adapter): Environment[O] = js.native
  def enforceUpdate[E /* <: Environment[Options] */](env: E): E = js.native
  def namespaceToName(namespace: String): String = js.native
}

