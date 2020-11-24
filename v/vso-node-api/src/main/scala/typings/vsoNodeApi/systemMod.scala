package typings.vsoNodeApi

import org.scalablytyped.runtime.TopLevel
import typings.vsoNodeApi.anon.EnumValuesMonday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/interfaces/common/System", JSImport.Namespace)
@js.native
object systemMod extends js.Object {
  
  @js.native
  sealed trait DayOfWeek extends js.Object
  @js.native
  object DayOfWeek extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
    
    /**
      * Indicates Friday.
      */
    @js.native
    sealed trait Friday extends DayOfWeek
    /* 5 */ @js.native
    object Friday extends TopLevel[Friday with Double]
    
    /**
      * Indicates Monday.
      */
    @js.native
    sealed trait Monday extends DayOfWeek
    /* 1 */ @js.native
    object Monday extends TopLevel[Monday with Double]
    
    /**
      * Indicates Saturday.
      */
    @js.native
    sealed trait Saturday extends DayOfWeek
    /* 6 */ @js.native
    object Saturday extends TopLevel[Saturday with Double]
    
    /**
      * Indicates Sunday.
      */
    @js.native
    sealed trait Sunday extends DayOfWeek
    /* 0 */ @js.native
    object Sunday extends TopLevel[Sunday with Double]
    
    /**
      * Indicates Thursday.
      */
    @js.native
    sealed trait Thursday extends DayOfWeek
    /* 4 */ @js.native
    object Thursday extends TopLevel[Thursday with Double]
    
    /**
      * Indicates Tuesday.
      */
    @js.native
    sealed trait Tuesday extends DayOfWeek
    /* 2 */ @js.native
    object Tuesday extends TopLevel[Tuesday with Double]
    
    /**
      * Indicates Wednesday.
      */
    @js.native
    sealed trait Wednesday extends DayOfWeek
    /* 3 */ @js.native
    object Wednesday extends TopLevel[Wednesday with Double]
  }
  
  @js.native
  object TypeInfo extends js.Object {
    
    var DayOfWeek: EnumValuesMonday = js.native
  }
}
