package typings.unlCore

import typings.unlCore.mod.Direction
import typings.unlCore.mod.ElevationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlCoreStrings {
  
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  
  @scala.inline
  def N: N = "N".asInstanceOf[N]
  
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  
  @scala.inline
  def W: W = "W".asInstanceOf[W]
  
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  
  @scala.inline
  def heightincm: heightincm = "heightincm".asInstanceOf[heightincm]
  
  @js.native
  sealed trait E extends Direction
  
  @js.native
  sealed trait N extends Direction
  
  @js.native
  sealed trait S extends Direction
  
  @js.native
  sealed trait W extends Direction
  
  @js.native
  sealed trait floor extends ElevationType
  
  @js.native
  sealed trait heightincm extends ElevationType
}
