package typings.wixUiCore

import typings.wixUiCore.anon.Am
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerConstantsMod {
  
  @js.native
  sealed trait AmPmOptions extends StObject
  @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "AmPmOptions")
  @js.native
  object AmPmOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AmPmOptions & String] = js.native
    
    @js.native
    sealed trait Capitalized
      extends StObject
         with AmPmOptions
    /* "capitalized" */ val Capitalized: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Capitalized & String = js.native
    
    @js.native
    sealed trait Lowercase
      extends StObject
         with AmPmOptions
    /* "lowercase" */ val Lowercase: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Lowercase & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with AmPmOptions
    /* "none" */ val None: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.None & String = js.native
    
    @js.native
    sealed trait Uppercase
      extends StObject
         with AmPmOptions
    /* "uppercase" */ val Uppercase: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Uppercase & String = js.native
  }
  
  object AmPmStrings {
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "AmPmStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "AmPmStrings.capitalized")
    @js.native
    def capitalized: Am = js.native
    inline def capitalized_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capitalized")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "AmPmStrings.lowercase")
    @js.native
    def lowercase: Am = js.native
    inline def lowercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "AmPmStrings.uppercase")
    @js.native
    def uppercase: Am = js.native
    inline def uppercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "BLANK")
  @js.native
  val BLANK: /* "--" */ String = js.native
  
  @js.native
  sealed trait FIELD extends StObject
  @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "FIELD")
  @js.native
  object FIELD extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FIELD & Double] = js.native
    
    @js.native
    sealed trait AFTER
      extends StObject
         with FIELD
    /* 4 */ val AFTER: typings.wixUiCore.timePickerConstantsMod.FIELD.AFTER & Double = js.native
    
    @js.native
    sealed trait AMPM
      extends StObject
         with FIELD
    /* 3 */ val AMPM: typings.wixUiCore.timePickerConstantsMod.FIELD.AMPM & Double = js.native
    
    @js.native
    sealed trait BEFORE
      extends StObject
         with FIELD
    /* 0 */ val BEFORE: typings.wixUiCore.timePickerConstantsMod.FIELD.BEFORE & Double = js.native
    
    @js.native
    sealed trait HOUR
      extends StObject
         with FIELD
    /* 1 */ val HOUR: typings.wixUiCore.timePickerConstantsMod.FIELD.HOUR & Double = js.native
    
    @js.native
    sealed trait MINUTE
      extends StObject
         with FIELD
    /* 2 */ val MINUTE: typings.wixUiCore.timePickerConstantsMod.FIELD.MINUTE & Double = js.native
  }
  
  @JSImport("wix-ui-core/dist/src/components/time-picker/constants", "NULL_TIME")
  @js.native
  val NULL_TIME: String = js.native
}
