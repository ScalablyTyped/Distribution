package typings.tablesorter

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/System/MappedSettings", JSImport.Namespace)
@js.native
object mappedSettingsMod extends js.Object {
  
  type MappedSettings[T] = (/**
    * The jquery-selector and their settings.
    */
  StringDictionary[T]) with (/**
    * The column-index and its settings.
    */
  NumberDictionary[T])
}
