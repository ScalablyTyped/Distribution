package typings.xar

import typings.xar.mod.Compression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xarStrings {
  
  @js.native
  sealed trait gzip
    extends StObject
       with Compression
  inline def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait none
    extends StObject
       with Compression
  inline def none: none = "none".asInstanceOf[none]
}
