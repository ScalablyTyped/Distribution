package typings.unlCore

import typings.unlCore.mod.Direction
import typings.unlCore.mod.ElevationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlCoreStrings {
  
  @js.native
  sealed trait E extends Direction
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  
  @js.native
  sealed trait N extends Direction
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait S extends Direction
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait W extends Direction
  @scala.inline
  def W: W = "W".asInstanceOf[W]
  
  @js.native
  sealed trait floor extends ElevationType
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  
  @js.native
  sealed trait heightincm extends ElevationType
  @scala.inline
  def heightincm: heightincm = "heightincm".asInstanceOf[heightincm]
}
