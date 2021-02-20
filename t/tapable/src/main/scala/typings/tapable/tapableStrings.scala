package typings.tapable

import typings.tapable.mod.TapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapableStrings {
  
  @js.native
  sealed trait async extends TapType
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait promise extends TapType
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  
  @js.native
  sealed trait sync extends TapType
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
}
