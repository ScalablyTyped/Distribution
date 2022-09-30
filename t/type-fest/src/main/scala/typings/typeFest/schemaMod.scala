package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  type Schema[ObjectType, ValueType] = ValueType | (SchemaObject[ObjectType, ValueType])
  
  /**
  Same as `Schema`, but accepts only `object`s as inputs. Internal helper for `Schema`.
  */
  type SchemaObject[ObjectType /* <: js.Object */, K] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType ]: type-fest.type-fest/source/schema.Schema<ObjectType[KeyType], K> | K}
    */ typings.typeFest.typeFestStrings.SchemaObject & TopLevel[ObjectType]
}
