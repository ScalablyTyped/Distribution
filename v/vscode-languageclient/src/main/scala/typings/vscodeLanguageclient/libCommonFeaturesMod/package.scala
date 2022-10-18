package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscodeLanguageclient.libCommonFeaturesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ensure[T, K /* <: /* keyof T */ String */](target: T, key: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type CreateParamsSignature[E, P] = js.Function1[/* data */ E, P]

type NextSignature[P, R] = js.ThisFunction2[/* this */ Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
