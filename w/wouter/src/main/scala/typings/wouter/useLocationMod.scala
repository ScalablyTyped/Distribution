package typings.wouter

import org.scalablytyped.runtime.Shortcut
import typings.std.ReturnType
import typings.wouter.anon.Base
import typings.wouter.anon.Replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLocationMod extends Shortcut {
  
  @JSImport("wouter/preact/use-location", JSImport.Default)
  @js.native
  val default: LocationHook = js.native
  
  type BaseLocationHook = js.Function1[
    /* repeated */ js.Any, 
    js.Tuple2[Path, js.Function2[/* path */ Path, /* repeated */ js.Any, js.Any]]
  ]
  
  type HookNavigationOptions[H /* <: BaseLocationHook */] = js.Object
  
  type HookReturnValue[H /* <: BaseLocationHook */] = ReturnType[H]
  
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[Base], 
    js.Tuple2[Path, js.Function2[/* to */ Path, /* options */ js.UndefOr[Replace], Unit]]
  ]
  
  type LocationTuple = HookReturnValue[LocationHook]
  
  type Path = String
  
  type _To = LocationHook
  
  /* This means you don't have to write `default`, but can instead just say `useLocationMod.foo` */
  override def _to: LocationHook = default
}
