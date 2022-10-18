package typings.typeormAuroraDataApiDriver

import typings.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.ArrayDefinedStringEnumType
import typings.typeormAuroraDataApiDriver.distTypesTestFunctionalUtilsCreateConnectionMod.DbType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeormAuroraDataApiDriverStrings {
  
  @js.native
  sealed trait admin
    extends StObject
       with ArrayDefinedStringEnumType
  inline def admin: admin = "admin".asInstanceOf[admin]
  
  @js.native
  sealed trait editor
    extends StObject
       with ArrayDefinedStringEnumType
  inline def editor: editor = "editor".asInstanceOf[editor]
  
  @js.native
  sealed trait ghost
    extends StObject
       with ArrayDefinedStringEnumType
  inline def ghost: ghost = "ghost".asInstanceOf[ghost]
  
  @js.native
  sealed trait mysql
    extends StObject
       with DbType
  inline def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait postgres
    extends StObject
       with DbType
  inline def postgres: postgres = "postgres".asInstanceOf[postgres]
}
