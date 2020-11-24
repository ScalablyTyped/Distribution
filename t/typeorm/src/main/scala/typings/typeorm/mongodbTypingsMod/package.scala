package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mongodbTypingsMod {
  
  type AggregationCursorResult = js.Any | scala.Unit
  
  type CursorResult = js.Any | scala.Unit | scala.Boolean
  
  type EndCallback = js.Function1[/* error */ typings.typeorm.mongodbTypingsMod.MongoError, scala.Unit]
  
  type FilterQuery[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | typeorm.typeorm/driver/mongodb/typings.Condition<T, P>}
    */ typings.typeorm.typeormStrings.FilterQuery with org.scalablytyped.runtime.TopLevel[T]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[typings.typeorm.mongodbTypingsMod.MongoError], scala.Unit]
  
  type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]
  
  type MongoCallback[T] = js.Function2[/* error */ typings.typeorm.mongodbTypingsMod.MongoError, /* result */ T, scala.Unit]
}
