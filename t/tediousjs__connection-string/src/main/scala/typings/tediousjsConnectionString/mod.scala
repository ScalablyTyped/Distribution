package typings.tediousjsConnectionString

import typings.tediousjsConnectionString.connectionStringMod.ParserConfig
import typings.tediousjsConnectionString.sqlConnectionStringMod.SchemaDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tediousjs/connection-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseConnectionString(connectionString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConnectionString")(connectionString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parseConnectionString(connectionString: String, parserConfig: ParserConfig): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConnectionString")(connectionString.asInstanceOf[js.Any], parserConfig.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def parseSqlConnectionString(connectionString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Boolean, allowUnknown: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Boolean, allowUnknown: Boolean, strict: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Boolean,
    allowUnknown: Boolean,
    strict: Boolean,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Boolean,
    allowUnknown: Boolean,
    strict: Unit,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Boolean, allowUnknown: Unit, strict: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Boolean,
    allowUnknown: Unit,
    strict: Boolean,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Boolean,
    allowUnknown: Unit,
    strict: Unit,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Unit, allowUnknown: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Unit, allowUnknown: Boolean, strict: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Unit,
    allowUnknown: Boolean,
    strict: Boolean,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Unit,
    allowUnknown: Boolean,
    strict: Unit,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(connectionString: String, canonicalProps: Unit, allowUnknown: Unit, strict: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Unit,
    allowUnknown: Unit,
    strict: Boolean,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parseSqlConnectionString(
    connectionString: String,
    canonicalProps: Unit,
    allowUnknown: Unit,
    strict: Unit,
    schema: SchemaDefinition
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSqlConnectionString")(connectionString.asInstanceOf[js.Any], canonicalProps.asInstanceOf[js.Any], allowUnknown.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
