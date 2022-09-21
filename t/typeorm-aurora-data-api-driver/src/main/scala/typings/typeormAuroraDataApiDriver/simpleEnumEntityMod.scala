package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleEnumEntityMod {
  
  @js.native
  sealed trait HeterogeneousEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "HeterogeneousEnum")
  @js.native
  object HeterogeneousEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double | String): js.UndefOr[HeterogeneousEnum & (Double | String)] = js.native
    
    @js.native
    sealed trait NO
      extends StObject
         with HeterogeneousEnum
    /* 0 */ val NO: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.HeterogeneousEnum.NO & (Double | String) = js.native
    
    @js.native
    sealed trait YES
      extends StObject
         with HeterogeneousEnum
    /* "YES" */ val YES: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.HeterogeneousEnum.YES & (Double | String) = js.native
  }
  
  @js.native
  sealed trait NumericEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "NumericEnum")
  @js.native
  object NumericEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NumericEnum & Double] = js.native
    
    @js.native
    sealed trait ADMIN
      extends StObject
         with NumericEnum
    /* 0 */ val ADMIN: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.NumericEnum.ADMIN & Double = js.native
    
    @js.native
    sealed trait EDITOR
      extends StObject
         with NumericEnum
    /* 1 */ val EDITOR: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.NumericEnum.EDITOR & Double = js.native
    
    @js.native
    sealed trait GHOST
      extends StObject
         with NumericEnum
    /* 3 */ val GHOST: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.NumericEnum.GHOST & Double = js.native
    
    @js.native
    sealed trait MODERATOR
      extends StObject
         with NumericEnum
    /* 2 */ val MODERATOR: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.NumericEnum.MODERATOR & Double = js.native
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "SimpleEnumEntity")
  @js.native
  open class SimpleEnumEntity () extends StObject {
    
    var arrayDefinedNumericEnum: ArrayDefinedNumericEnumType = js.native
    
    var arrayDefinedStringEnum: ArrayDefinedStringEnumType = js.native
    
    var enumWithoutdefault: StringEnum = js.native
    
    var heterogeneousEnum: HeterogeneousEnum = js.native
    
    var id: Double = js.native
    
    var numericEnum: NumericEnum = js.native
    
    var numericSimpleEnum: NumericEnum = js.native
    
    var stringEnum: StringEnum = js.native
    
    var stringNumericEnum: StringNumericEnum = js.native
  }
  
  @js.native
  sealed trait StringEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "StringEnum")
  @js.native
  object StringEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StringEnum & String] = js.native
    
    @js.native
    sealed trait ADMIN
      extends StObject
         with StringEnum
    /* "a" */ val ADMIN: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringEnum.ADMIN & String = js.native
    
    @js.native
    sealed trait EDITOR
      extends StObject
         with StringEnum
    /* "e" */ val EDITOR: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringEnum.EDITOR & String = js.native
    
    @js.native
    sealed trait GHOST
      extends StObject
         with StringEnum
    /* "g" */ val GHOST: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringEnum.GHOST & String = js.native
    
    @js.native
    sealed trait MODERATOR
      extends StObject
         with StringEnum
    /* "m" */ val MODERATOR: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringEnum.MODERATOR & String = js.native
  }
  
  @js.native
  sealed trait StringNumericEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "StringNumericEnum")
  @js.native
  object StringNumericEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StringNumericEnum & String] = js.native
    
    @js.native
    sealed trait FOUR
      extends StObject
         with StringNumericEnum
    /* "4" */ val FOUR: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringNumericEnum.FOUR & String = js.native
    
    @js.native
    sealed trait ONE
      extends StObject
         with StringNumericEnum
    /* "1" */ val ONE: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringNumericEnum.ONE & String = js.native
    
    @js.native
    sealed trait THREE
      extends StObject
         with StringNumericEnum
    /* "3" */ val THREE: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringNumericEnum.THREE & String = js.native
    
    @js.native
    sealed trait TWO
      extends StObject
         with StringNumericEnum
    /* "2" */ val TWO: typings.typeormAuroraDataApiDriver.simpleEnumEntityMod.StringNumericEnum.TWO & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`11`
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`12`
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`13`
  */
  trait ArrayDefinedNumericEnumType extends StObject
  object ArrayDefinedNumericEnumType {
    
    inline def `11`: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`11` = 11.asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`11`]
    
    inline def `12`: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`12` = 12.asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`12`]
    
    inline def `13`: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`13` = 13.asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverNumbers.`13`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost
  */
  trait ArrayDefinedStringEnumType extends StObject
  object ArrayDefinedStringEnumType {
    
    inline def admin: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin = "admin".asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin]
    
    inline def editor: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor = "editor".asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor]
    
    inline def ghost: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost = "ghost".asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost]
  }
}
