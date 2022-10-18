package typings.tsLoader

import typings.tsLoader.distInterfacesMod.TSInstance
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInstanceCacheMod {
  
  @JSImport("ts-loader/dist/instance-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTSInstanceFromCache(key: Compiler, name: String): js.UndefOr[TSInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTSInstanceFromCache")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TSInstance]]
  
  inline def setTSInstanceInCache(key: Unit, name: String, instance: TSInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTSInstanceInCache")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTSInstanceInCache(key: Compiler, name: String, instance: TSInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTSInstanceInCache")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
