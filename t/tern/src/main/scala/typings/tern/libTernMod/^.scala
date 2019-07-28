package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/tern", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Server: TernConstructor = js.native
  val version: String = js.native
  def defineQueryType[T /* <: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: Desc[T]): Unit = js.native
  def registerPlugin(
    name: String,
    init: js.Function2[
      /* server */ typings.tern.libTernMod.Server, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Unit
    ]
  ): Unit = js.native
}

