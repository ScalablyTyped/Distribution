package typings.uniApp

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyObject = Record[String, Any]

type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: T[K]}
  */ typings.uniApp.uniAppStrings.KVInfer & TopLevel[T]

type Void[T] = js.UndefOr[T | Null]
