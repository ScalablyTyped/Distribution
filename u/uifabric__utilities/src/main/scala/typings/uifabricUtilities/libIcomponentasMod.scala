package typings.uifabricUtilities

import typings.react.mod.ComponentType
import typings.uifabricUtilities.anon.DefaultRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcomponentasMod {
  
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  
  type IComponentAsProps[T] = T & DefaultRender[T]
}
