package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static class that provides well known CSIM file paths. */
@JSGlobal("Windows.Networking.NetworkOperators.KnownCSimFilePaths")
@js.native
abstract class KnownCSimFilePaths ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.KnownCSimFilePaths
object KnownCSimFilePaths {
  
  @JSGlobal("Windows.Networking.NetworkOperators.KnownCSimFilePaths")
  @js.native
  val ^ : js.Any = js.native
  
  /** Static property that gets the EFSPN path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownCSimFilePaths.efSpn")
  @js.native
  def efSpn: IVectorView[Double] = js.native
  inline def efSpn_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("efSpn")(x.asInstanceOf[js.Any])
  
  /** Static property that gets the GID1 path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownCSimFilePaths.gid1")
  @js.native
  def gid1: IVectorView[Double] = js.native
  inline def gid1_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid1")(x.asInstanceOf[js.Any])
  
  /** Static property that gets the GID2 path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownCSimFilePaths.gid2")
  @js.native
  def gid2: IVectorView[Double] = js.native
  inline def gid2_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid2")(x.asInstanceOf[js.Any])
}
