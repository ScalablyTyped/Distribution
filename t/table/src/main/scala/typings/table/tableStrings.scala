package typings.table

import typings.table.apiMod.Alignment
import typings.table.apiMod.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableStrings {
  
  @js.native
  sealed trait border extends StObject
  inline def border: border = "border".asInstanceOf[border]
  
  @js.native
  sealed trait bottom
    extends StObject
       with VerticalAlignment
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait cell extends StObject
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait center
    extends StObject
       with Alignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait configDotjson extends StObject
  inline def configDotjson: configDotjson = "config.json".asInstanceOf[configDotjson]
  
  @js.native
  sealed trait justify
    extends StObject
       with Alignment
  inline def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait left
    extends StObject
       with Alignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle
    extends StObject
       with VerticalAlignment
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait right
    extends StObject
       with Alignment
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait row extends StObject
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait streamConfigDotjson extends StObject
  inline def streamConfigDotjson: streamConfigDotjson = "streamConfig.json".asInstanceOf[streamConfigDotjson]
  
  @js.native
  sealed trait top
    extends StObject
       with VerticalAlignment
  inline def top: top = "top".asInstanceOf[top]
}
