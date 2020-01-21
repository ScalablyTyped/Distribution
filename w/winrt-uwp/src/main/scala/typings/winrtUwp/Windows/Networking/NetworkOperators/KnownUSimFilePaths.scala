package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static class that provides known USIM file paths. */
@JSGlobal("Windows.Networking.NetworkOperators.KnownUSimFilePaths")
@js.native
abstract class KnownUSimFilePaths () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.KnownUSimFilePaths")
@js.native
object KnownUSimFilePaths extends js.Object {
  /** Static property that gets the EFOPL path. */
  var efOpl: IVectorView[Double] = js.native
  /** Static property that gets the EFPNN path. */
  var efPnn: IVectorView[Double] = js.native
  /** Static property that gets the EFSPN path. */
  var efSpn: IVectorView[Double] = js.native
  /** Static property that gets the GID1 path. */
  var gid1: IVectorView[Double] = js.native
  /** Static property that gets the GID2 path. */
  var gid2: IVectorView[Double] = js.native
}

