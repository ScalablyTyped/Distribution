package typings.vsoNodeApi

import typings.vsoNodeApi.anon.EnumValuesMonday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMod {
  
  @js.native
  sealed trait DayOfWeek extends StObject
  @JSImport("vso-node-api/interfaces/common/System", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
    
    /**
      * Indicates Friday.
      */
    @js.native
    sealed trait Friday extends DayOfWeek
    /* 5 */ val Friday: typings.vsoNodeApi.systemMod.DayOfWeek.Friday with Double = js.native
    
    /**
      * Indicates Monday.
      */
    @js.native
    sealed trait Monday extends DayOfWeek
    /* 1 */ val Monday: typings.vsoNodeApi.systemMod.DayOfWeek.Monday with Double = js.native
    
    /**
      * Indicates Saturday.
      */
    @js.native
    sealed trait Saturday extends DayOfWeek
    /* 6 */ val Saturday: typings.vsoNodeApi.systemMod.DayOfWeek.Saturday with Double = js.native
    
    /**
      * Indicates Sunday.
      */
    @js.native
    sealed trait Sunday extends DayOfWeek
    /* 0 */ val Sunday: typings.vsoNodeApi.systemMod.DayOfWeek.Sunday with Double = js.native
    
    /**
      * Indicates Thursday.
      */
    @js.native
    sealed trait Thursday extends DayOfWeek
    /* 4 */ val Thursday: typings.vsoNodeApi.systemMod.DayOfWeek.Thursday with Double = js.native
    
    /**
      * Indicates Tuesday.
      */
    @js.native
    sealed trait Tuesday extends DayOfWeek
    /* 2 */ val Tuesday: typings.vsoNodeApi.systemMod.DayOfWeek.Tuesday with Double = js.native
    
    /**
      * Indicates Wednesday.
      */
    @js.native
    sealed trait Wednesday extends DayOfWeek
    /* 3 */ val Wednesday: typings.vsoNodeApi.systemMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/common/System", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/common/System", "TypeInfo.DayOfWeek")
    @js.native
    def DayOfWeek: EnumValuesMonday = js.native
    @scala.inline
    def DayOfWeek_=(x: EnumValuesMonday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(x.asInstanceOf[js.Any])
  }
}
