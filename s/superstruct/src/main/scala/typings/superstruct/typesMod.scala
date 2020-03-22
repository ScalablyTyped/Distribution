package typings.superstruct

import typings.superstruct.structErrorMod.Branch
import typings.superstruct.structErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  object Types extends js.Object {
    /**
      * Matches any value other than `undefined`.
      *
      * ```js
      * 'anything'
      * true
      * ```
      */
    def any(value: js.Any): Boolean = js.native
    /**
      * Matches an `arguments` object.
      *
      * ```js
      * arguments
      * ```
      */
    def arguments(value: js.Any): Boolean = js.native
    /**
      * Matches an `Array`.
      *
      * ```js
      * [1, 2, 3]
      * ```
      */
    def array(value: js.Any): Boolean = js.native
    /**
      * Matches a boolean.
      *
      * ```js
      * true
      * false
      * ```
      */
    def boolean(value: js.Any): Boolean = js.native
    /**
      * Matches a Node.js `Buffer`.
      *
      * ```js
      * Buffer.from('string')
      * ```
      */
    def buffer(value: js.Any): Boolean = js.native
    /**
      * Matches a **valid** `Date` object.
      *
      * ```js
      * new Date()
      * ```
      *
      * Note: Invalid `Date` objects that equal `NaN` are not matched.
      */
    def date(value: js.Any): Boolean = js.native
    /**
      * Matches an error object.
      *
      * ```js
      * new Error()
      * ```
      */
    def error(value: js.Any): Boolean = js.native
    /**
      * Matches a `Float32Array` object.
      */
    def float32array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Float64Array` object.
      */
    def float64array(value: js.Any): Boolean = js.native
    /**
      * Matches a function.
      *
      * ```js
      * () => {}
      * function () {}
      * ```
      */
    def function(value: js.Any): Boolean = js.native
    /**
      * Matches a generator function.
      *
      * ```js
      * function* () {}
      * ```
      */
    def generatorfunction(value: js.Any): Boolean = js.native
    /**
      * Matches a `Int16Array` object.
      */
    def int16array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Int32Array` object.
      */
    def int32array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Int8Array` object.
      */
    def int8array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Map` object.
      *
      * ```js
      * new Map()
      * ```
      */
    def map(value: js.Any): Boolean = js.native
    /**
      * Matches the `null` literal value.
      *
      * ```js
      * null
      * ```
      */
    def `null`(value: js.Any): Boolean = js.native
    /**
      * Matches a number.
      *
      * ```js
      * 42
      * ```
      */
    def number(value: js.Any): Boolean = js.native
    /**
      * Matches a plain object.
      *
      * ```js
      * { key: 'value' }
      * { something: true }
      * ```
      */
    def `object`(value: js.Any): Boolean = js.native
    /**
      * Matches a `Promise` object.
      *
      * ```js
      * Promise.resolve()
      * ```
      */
    def promise(value: js.Any): Boolean = js.native
    /**
      * Matches a regular expression object.
      *
      * ```js
      * /a-z/g
      * ```
      */
    def regexp(value: js.Any): Boolean = js.native
    /**
      * Matches a `Set` object.
      *
      * ```js
      * new Set()
      * ```
      */
    def set(value: js.Any): Boolean = js.native
    /**
      * Matches a string.
      *
      * ```js
      * 'text'
      * ```
      */
    def string(value: js.Any): Boolean = js.native
    /**
      * Matches a `Symbol`.
      *
      * ```js
      * Symbol()
      * ```
      */
    def symbol(value: js.Any): Boolean = js.native
    /**
      * Matches a `Uint16Array` object.
      */
    def uint16array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Uint32Array` object.
      */
    def uint32array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Uint8Array` object.
      */
    def uint8array(value: js.Any): Boolean = js.native
    /**
      * Matches a `Uint8ClampedArray` object.
      */
    def uint8clampedarray(value: js.Any): Boolean = js.native
    /**
      * Matches the `undefined` literal value.
      *
      * ```js
      * undefined
      * ```
      */
    def undefined(value: js.Any): Boolean = js.native
    /**
      * Matches a `WeakMap` object.
      *
      * ```js
      * new WeakMap()
      * ```
      */
    def weakmap(value: js.Any): Boolean = js.native
    /**
      * Matches a `WeakSet` object.
      *
      * ```js
      * new WeakSet()
      * ```
      */
    def weakset(value: js.Any): Boolean = js.native
  }
  
  type Validator = js.Function3[
    /* value */ js.Any, 
    /* branch */ Branch, 
    /* path */ Path, 
    js.Array[PartialFailure] | PartialFailure | Boolean
  ]
}

