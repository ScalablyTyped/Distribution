package typings.yogBigpipe

import typings.yogBigpipe.mod.Pagelet.mode
import typings.yogBigpipe.mod.Pagelet.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yogBigpipeStrings {
  
  @js.native
  sealed trait async
    extends StObject
       with mode
  inline def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait failed
    extends StObject
       with status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with status
  inline def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait pending
    extends StObject
       with status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pipeline
    extends StObject
       with mode
  inline def pipeline: pipeline = "pipeline".asInstanceOf[pipeline]
  
  @js.native
  sealed trait quickling
    extends StObject
       with mode
  inline def quickling: quickling = "quickling".asInstanceOf[quickling]
  
  @js.native
  sealed trait rendering
    extends StObject
       with status
  inline def rendering: rendering = "rendering".asInstanceOf[rendering]
}
