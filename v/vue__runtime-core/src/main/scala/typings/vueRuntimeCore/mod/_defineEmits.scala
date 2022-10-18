package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.vueRuntimeCoreStrings.at
import typings.vueRuntimeCore.vueRuntimeCoreStrings.concat
import typings.vueRuntimeCore.vueRuntimeCoreStrings.copyWithin
import typings.vueRuntimeCore.vueRuntimeCoreStrings.entries
import typings.vueRuntimeCore.vueRuntimeCoreStrings.every
import typings.vueRuntimeCore.vueRuntimeCoreStrings.fill
import typings.vueRuntimeCore.vueRuntimeCoreStrings.filter
import typings.vueRuntimeCore.vueRuntimeCoreStrings.find
import typings.vueRuntimeCore.vueRuntimeCoreStrings.findIndex
import typings.vueRuntimeCore.vueRuntimeCoreStrings.flat
import typings.vueRuntimeCore.vueRuntimeCoreStrings.flatMap
import typings.vueRuntimeCore.vueRuntimeCoreStrings.forEach
import typings.vueRuntimeCore.vueRuntimeCoreStrings.includes
import typings.vueRuntimeCore.vueRuntimeCoreStrings.indexOf
import typings.vueRuntimeCore.vueRuntimeCoreStrings.join
import typings.vueRuntimeCore.vueRuntimeCoreStrings.keys
import typings.vueRuntimeCore.vueRuntimeCoreStrings.lastIndexOf
import typings.vueRuntimeCore.vueRuntimeCoreStrings.length
import typings.vueRuntimeCore.vueRuntimeCoreStrings.map
import typings.vueRuntimeCore.vueRuntimeCoreStrings.pop
import typings.vueRuntimeCore.vueRuntimeCoreStrings.push
import typings.vueRuntimeCore.vueRuntimeCoreStrings.reduce
import typings.vueRuntimeCore.vueRuntimeCoreStrings.reduceRight
import typings.vueRuntimeCore.vueRuntimeCoreStrings.reverse
import typings.vueRuntimeCore.vueRuntimeCoreStrings.shift
import typings.vueRuntimeCore.vueRuntimeCoreStrings.slice
import typings.vueRuntimeCore.vueRuntimeCoreStrings.some
import typings.vueRuntimeCore.vueRuntimeCoreStrings.sort
import typings.vueRuntimeCore.vueRuntimeCoreStrings.splice
import typings.vueRuntimeCore.vueRuntimeCoreStrings.toLocaleString
import typings.vueRuntimeCore.vueRuntimeCoreStrings.toString
import typings.vueRuntimeCore.vueRuntimeCoreStrings.unshift
import typings.vueRuntimeCore.vueRuntimeCoreStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _defineEmits extends StObject {
  
  def apply[TypeEmit](): TypeEmit = js.native
  def apply[E /* <: EmitsOptions */](emitOptions: E): EmitFn[E, /* keyof E */ String] = js.native
  def apply[EE /* <: String */](emitOptions: js.Array[EE]): EmitFn[
    js.Array[EE], 
    /* keyof std.Array<EE> */ length | toString | toLocaleString | pop | push | concat | join | reverse | shift | slice | sort | splice | unshift | indexOf | lastIndexOf | every | some | forEach | map | filter | reduce | reduceRight | find | findIndex | fill | copyWithin | entries | keys | values | includes | flatMap | flat | at
  ] = js.native
}
