package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregationCursorResult = js.Any | scala.Unit

type CursorResult = js.Any | scala.Unit | scala.Boolean

type EndCallback = js.Function1[/* error */ typings.typeorm.typingsMod.MongoError, scala.Unit]

type FilterQuery[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P] | typeorm.typeorm/browser/driver/mongodb/typings.Condition<T, P>}
  */ typings.typeorm.typeormStrings.FilterQuery & org.scalablytyped.runtime.TopLevel[T]) | org.scalablytyped.runtime.StringDictionary[js.Any]

type GridFSBucketErrorCallback = js.Function1[/* err */ js.UndefOr[typings.typeorm.typingsMod.MongoError], scala.Unit]

type IteratorCallback[T] = js.Function1[/* doc */ T, scala.Unit]

type MongoCallback[T] = js.Function2[/* error */ typings.typeorm.typingsMod.MongoError, /* result */ T, scala.Unit]
