package typings.vsoNodeApi

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/common/System", JSImport.Namespace)
@js.native
object systemMod extends js.Object {
  @js.native
  sealed trait DayOfWeek extends js.Object
  
  @js.native
  object DayOfWeek extends js.Object {
    /**
      * Indicates Friday.
      */
    @js.native
    sealed trait Friday extends DayOfWeek
    
    /**
      * Indicates Monday.
      */
    @js.native
    sealed trait Monday extends DayOfWeek
    
    /**
      * Indicates Saturday.
      */
    @js.native
    sealed trait Saturday extends DayOfWeek
    
    /**
      * Indicates Sunday.
      */
    @js.native
    sealed trait Sunday extends DayOfWeek
    
    /**
      * Indicates Thursday.
      */
    @js.native
    sealed trait Thursday extends DayOfWeek
    
    /**
      * Indicates Tuesday.
      */
    @js.native
    sealed trait Tuesday extends DayOfWeek
    
    /**
      * Indicates Wednesday.
      */
    @js.native
    sealed trait Wednesday extends DayOfWeek
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
    /* 5 */ @js.native
    object Friday extends TopLevel[Friday with Double]
    
    /* 1 */ @js.native
    object Monday extends TopLevel[Monday with Double]
    
    /* 6 */ @js.native
    object Saturday extends TopLevel[Saturday with Double]
    
    /* 0 */ @js.native
    object Sunday extends TopLevel[Sunday with Double]
    
    /* 4 */ @js.native
    object Thursday extends TopLevel[Thursday with Double]
    
    /* 2 */ @js.native
    object Tuesday extends TopLevel[Tuesday with Double]
    
    /* 3 */ @js.native
    object Wednesday extends TopLevel[Wednesday with Double]
    
  }
  
  @js.native
  object TypeInfo extends js.Object {
    var DayOfWeek: AnonEnumValuesAnonMonday = js.native
  }
  
}

