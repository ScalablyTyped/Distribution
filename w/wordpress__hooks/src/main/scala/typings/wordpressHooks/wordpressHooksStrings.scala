package typings.wordpressHooks

import typings.wordpressHooks.mod.StoreKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressHooksStrings {
  
  @js.native
  sealed trait actions
    extends StObject
       with StoreKey
  inline def actions: actions = "actions".asInstanceOf[actions]
  
  @js.native
  sealed trait filters
    extends StObject
       with StoreKey
  inline def filters: filters = "filters".asInstanceOf[filters]
}
