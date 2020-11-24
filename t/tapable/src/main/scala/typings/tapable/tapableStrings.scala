package typings.tapable

import typings.tapable.mod.TapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapableStrings {
  
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait async extends TapType
  
  @js.native
  sealed trait promise extends TapType
  
  @js.native
  sealed trait sync extends TapType
}
