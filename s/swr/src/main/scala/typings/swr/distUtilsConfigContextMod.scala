package typings.swr

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.FC
import typings.swr.anon.PartialFullConfiguration
import typings.swr.anon.PropsWithChildrenvalueSWR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsConfigContextMod extends Shortcut {
  
  @JSImport("swr/dist/utils/config-context", JSImport.Default)
  @js.native
  val default: FC[PropsWithChildrenvalueSWR] = js.native
  
  @JSImport("swr/dist/utils/config-context", "SWRConfigContext")
  @js.native
  val SWRConfigContext: Context[PartialFullConfiguration] = js.native
  
  type _To = FC[PropsWithChildrenvalueSWR]
  
  /* This means you don't have to write `default`, but can instead just say `distUtilsConfigContextMod.foo` */
  override def _to: FC[PropsWithChildrenvalueSWR] = default
}
