package typings.unixPermissions

import typings.unixPermissions.unixPermissionsStrings._empty
import typings.unixPermissions.unixPermissionsStrings.`-_`
import typings.unixPermissions.unixPermissionsStrings.invalid
import typings.unixPermissions.unixPermissionsStrings.t_
import typings.unixPermissions.unixPermissionsStrings.x_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unix-permissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contain(permission: Permission, containedPermission: Permission, alsoContainedPermissions: Permission*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")((scala.List(permission.asInstanceOf[js.Any], containedPermission.asInstanceOf[js.Any])).`++`(alsoContainedPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  
  object convert {
    
    @JSImport("unix-permissions", "convert")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns `permission` converted to the number type.
      *
      * @example
      * ```js
      * convert.number('a+x') // 0o111
      *
      * try {
      *   convert.number('z+x') // Throws an exception (permission syntax is invalid)
      * } catch (error) {
      *   console.log(error.message)
      * }
      * ```
      */
    inline def number(permission: Permission): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionNumber]
    
    /**
      * Returns `permission` converted to the object type.
      *
      * @example
      * ```js
      * convert.object('a+x')
      * // {
      * //   user: { execute: true },
      * //   group: { execute: true },
      * //   others: { execute: true }
      * // }
      *
      * try {
      *   convert.object('z+x') // Throws an exception (permission syntax is invalid)
      * } catch (error) {
      *   console.log(error.message)
      * }
      * ```
      */
    inline def `object`(permission: Permission): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionObject]
    
    /**
      * Returns `permission` converted to the octal type.
      *
      * @example
      * ```js
      * convert.octal('a+x') // '+0111'
      *
      * try {
      *   convert.octal('z+x') // Throws an exception (permission syntax is invalid)
      * } catch (error) {
      *   console.log(error.message)
      * }
      * ```
      */
    inline def octal(permission: Permission): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("octal")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionOctal]
    
    /**
      * Returns `permission` converted to the stat type.
      *
      * @example
      * ```js
      * convert.stat('a+x') // '--x--x--x'
      *
      * try {
      *   convert.stat('z+x') // Throws an exception (permission syntax is invalid)
      * } catch (error) {
      *   console.log(error.message)
      * }
      * ```
      */
    inline def stat(permission: Permission): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionStat]
    
    /**
      * Returns `permission` converted to the symbolic type.
      *
      * @example
      * ```js
      * convert.symbolic('--x--x--x') // 'a=x'
      *
      * try {
      *   convert.symbolic('--o--o--o') // Throws an exception (permission syntax is invalid)
      * } catch (error) {
      *   console.log(error.message)
      * }
      * ```
      */
    inline def symbolic(permission: Permission): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolic")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionSymbolic]
  }
  
  inline def equal(permission: Permission, equaledPermission: Permission, alsoEqualedPermissions: Permission*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")((scala.List(permission.asInstanceOf[js.Any], equaledPermission.asInstanceOf[js.Any])).`++`(alsoEqualedPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  
  inline def invert(permission: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def invert(permission: PermissionNumber): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionNumber]
  inline def invert(permission: PermissionObject): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionObject]
  inline def invert(permission: PermissionSymbolic): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionSymbolic]
  
  inline def invert_PermissionOctal(permission: PermissionOctal): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionOctal]
  
  inline def invert_PermissionStat(permission: PermissionStat): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionStat]
  
  inline def max(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[Unit]
  inline def max(permission: Any, otherPermissions: Permission*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[scala.Nothing]
  inline def max(permission: PermissionNumber, otherPermissions: Permission*): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionNumber]
  inline def max(permission: PermissionObject, otherPermissions: Permission*): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionObject]
  inline def max(permission: PermissionSymbolic, otherPermissions: Permission*): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionSymbolic]
  
  inline def max_PermissionOctal(permission: PermissionOctal, otherPermissions: Permission*): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionOctal]
  
  inline def max_PermissionStat(permission: PermissionStat, otherPermissions: Permission*): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionStat]
  
  inline def min(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[Unit]
  inline def min(permission: Any, otherPermissions: Permission*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[scala.Nothing]
  inline def min(permission: PermissionNumber, otherPermissions: Permission*): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionNumber]
  inline def min(permission: PermissionObject, otherPermissions: Permission*): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionObject]
  inline def min(permission: PermissionSymbolic, otherPermissions: Permission*): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionSymbolic]
  
  inline def min_PermissionOctal(permission: PermissionOctal, otherPermissions: Permission*): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionOctal]
  
  inline def min_PermissionStat(permission: PermissionStat, otherPermissions: Permission*): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(scala.List(permission.asInstanceOf[js.Any]).`++`(otherPermissions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[PermissionStat]
  
  inline def normalize(permission: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def normalize(permission: PermissionNumber): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionNumber]
  inline def normalize(permission: PermissionObject): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionObject]
  inline def normalize(permission: PermissionSymbolic): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionSymbolic]
  
  inline def normalize_PermissionOctal(permission: PermissionOctal): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionOctal]
  
  inline def normalize_PermissionStat(permission: PermissionStat): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionStat]
  
  inline def not(permission: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def not(permission: PermissionNumber): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionNumber]
  inline def not(permission: PermissionObject): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionObject]
  inline def not(permission: PermissionSymbolic): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionSymbolic]
  
  inline def not_PermissionOctal(permission: PermissionOctal): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionOctal]
  
  inline def not_PermissionStat(permission: PermissionStat): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionStat]
  
  inline def positive(permission: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def positive(permission: PermissionNumber): PermissionNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionNumber]
  inline def positive(permission: PermissionObject): PermissionObject = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionObject]
  inline def positive(permission: PermissionSymbolic): PermissionSymbolic = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionSymbolic]
  
  inline def positive_PermissionOctal(permission: PermissionOctal): PermissionOctal = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionOctal]
  
  inline def positive_PermissionStat(permission: PermissionStat): PermissionStat = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionStat]
  
  inline def set(permission: Any, setPermission: Permission, alsoSetPermissions: Permission*): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[scala.Nothing]
  inline def set(permission: PermissionNumber, setPermission: Permission, alsoSetPermissions: Permission*): PermissionNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PermissionNumber]
  inline def set(permission: PermissionObject, setPermission: Permission, alsoSetPermissions: Permission*): PermissionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PermissionObject]
  inline def set(permission: PermissionSymbolic, setPermission: Permission, alsoSetPermissions: Permission*): PermissionSymbolic = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PermissionSymbolic]
  
  inline def set_PermissionOctal(permission: PermissionOctal, setPermission: Permission, alsoSetPermissions: Permission*): PermissionOctal = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PermissionOctal]
  
  inline def set_PermissionStat(permission: PermissionStat, setPermission: Permission, alsoSetPermissions: Permission*): PermissionStat = (^.asInstanceOf[js.Dynamic].applyDynamic("set")((scala.List(permission.asInstanceOf[js.Any], setPermission.asInstanceOf[js.Any])).`++`(alsoSetPermissions.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PermissionStat]
  
  inline def `type`(permission: Any): invalid = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(permission.asInstanceOf[js.Any]).asInstanceOf[invalid]
  
  inline def type_PermissionType(permission: Permission): PermissionType = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(permission.asInstanceOf[js.Any]).asInstanceOf[PermissionType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.`0`
    - typings.unixPermissions.unixPermissionsStrings.`1`
    - typings.unixPermissions.unixPermissionsStrings.`2`
    - typings.unixPermissions.unixPermissionsStrings.`3`
    - typings.unixPermissions.unixPermissionsStrings.`4`
    - typings.unixPermissions.unixPermissionsStrings.`5`
    - typings.unixPermissions.unixPermissionsStrings.`6`
    - typings.unixPermissions.unixPermissionsStrings.`7`
  */
  trait OctalDigit extends StObject
  object OctalDigit {
    
    inline def `0`: typings.unixPermissions.unixPermissionsStrings.`0` = "0".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`0`]
    
    inline def `1`: typings.unixPermissions.unixPermissionsStrings.`1` = "1".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`1`]
    
    inline def `2`: typings.unixPermissions.unixPermissionsStrings.`2` = "2".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`2`]
    
    inline def `3`: typings.unixPermissions.unixPermissionsStrings.`3` = "3".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`3`]
    
    inline def `4`: typings.unixPermissions.unixPermissionsStrings.`4` = "4".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`4`]
    
    inline def `5`: typings.unixPermissions.unixPermissionsStrings.`5` = "5".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`5`]
    
    inline def `6`: typings.unixPermissions.unixPermissionsStrings.`6` = "6".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`6`]
    
    inline def `7`: typings.unixPermissions.unixPermissionsStrings.`7` = "7".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`7`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings._empty
    - typings.unixPermissions.unixPermissionsStrings.Equalssign
    - typings.unixPermissions.unixPermissionsStrings.Plussign
    - typings.unixPermissions.unixPermissionsStrings.`-_`
  */
  trait OctalOperator extends StObject
  object OctalOperator {
    
    inline def Equalssign: typings.unixPermissions.unixPermissionsStrings.Equalssign = "=".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.Equalssign]
    
    inline def Plussign: typings.unixPermissions.unixPermissionsStrings.Plussign = "+".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.Plussign]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _empty: typings.unixPermissions.unixPermissionsStrings._empty = "".asInstanceOf[typings.unixPermissions.unixPermissionsStrings._empty]
  }
  
  object OctalPrefix {
    
    inline def `0`: typings.unixPermissions.unixPermissionsStrings.`0` = "0".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`0`]
    
    inline def `0o`: typings.unixPermissions.unixPermissionsStrings.`0o` = "0o".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`0o`]
    
    inline def Backslash: /* \ */ String = "\\".asInstanceOf[/* \ */ String]
    
    inline def _empty: typings.unixPermissions.unixPermissionsStrings._empty = "".asInstanceOf[typings.unixPermissions.unixPermissionsStrings._empty]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings._empty
    - typings.unixPermissions.unixPermissionsStrings.`0o`
    - typings.unixPermissions.unixPermissionsStrings.`0`
    - / * \ * / java.lang.String
  */
  type OctalPrefix = _OctalPrefix | (/* \ */ String)
  
  type OctalStart = /* template literal string: ${OctalOperator}${OctalPrefix} */ String
  
  type Permission = PermissionOctal | PermissionNumber | PermissionStat | PermissionSymbolic | PermissionObject
  
  type PermissionNumber = Double
  
  /* Inlined std.Partial<{  user :unix-permissions.unix-permissions.PermissionObjectClass,   group :unix-permissions.unix-permissions.PermissionObjectClass,   others :unix-permissions.unix-permissions.PermissionObjectClass,   all :unix-permissions.unix-permissions.PermissionObjectClass,   special :unix-permissions.unix-permissions.PermissionObjectSpecial}> */
  trait PermissionObject extends StObject {
    
    var all: js.UndefOr[PermissionObjectClass] = js.undefined
    
    var group: js.UndefOr[PermissionObjectClass] = js.undefined
    
    var others: js.UndefOr[PermissionObjectClass] = js.undefined
    
    var special: js.UndefOr[PermissionObjectSpecial] = js.undefined
    
    var user: js.UndefOr[PermissionObjectClass] = js.undefined
  }
  object PermissionObject {
    
    inline def apply(): PermissionObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionObject] (val x: Self) extends AnyVal {
      
      inline def setAll(value: PermissionObjectClass): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setGroup(value: PermissionObjectClass): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setOthers(value: PermissionObjectClass): Self = StObject.set(x, "others", value.asInstanceOf[js.Any])
      
      inline def setOthersUndefined: Self = StObject.set(x, "others", js.undefined)
      
      inline def setSpecial(value: PermissionObjectSpecial): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      inline def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
      
      inline def setUser(value: PermissionObjectClass): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  read :unix-permissions.unix-permissions.PermissionObjectValue,   write :unix-permissions.unix-permissions.PermissionObjectValue,   execute :unix-permissions.unix-permissions.PermissionObjectValue}> */
  trait PermissionObjectClass extends StObject {
    
    var execute: js.UndefOr[PermissionObjectValue] = js.undefined
    
    var read: js.UndefOr[PermissionObjectValue] = js.undefined
    
    var write: js.UndefOr[PermissionObjectValue] = js.undefined
  }
  object PermissionObjectClass {
    
    inline def apply(): PermissionObjectClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionObjectClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionObjectClass] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: PermissionObjectValue): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setRead(value: PermissionObjectValue): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setWrite(value: PermissionObjectValue): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  setuid :unix-permissions.unix-permissions.PermissionObjectValue,   setgid :unix-permissions.unix-permissions.PermissionObjectValue,   sticky :unix-permissions.unix-permissions.PermissionObjectValue}> */
  trait PermissionObjectSpecial extends StObject {
    
    var setgid: js.UndefOr[PermissionObjectValue] = js.undefined
    
    var setuid: js.UndefOr[PermissionObjectValue] = js.undefined
    
    var sticky: js.UndefOr[PermissionObjectValue] = js.undefined
  }
  object PermissionObjectSpecial {
    
    inline def apply(): PermissionObjectSpecial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionObjectSpecial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PermissionObjectSpecial] (val x: Self) extends AnyVal {
      
      inline def setSetgid(value: PermissionObjectValue): Self = StObject.set(x, "setgid", value.asInstanceOf[js.Any])
      
      inline def setSetgidUndefined: Self = StObject.set(x, "setgid", js.undefined)
      
      inline def setSetuid(value: PermissionObjectValue): Self = StObject.set(x, "setuid", value.asInstanceOf[js.Any])
      
      inline def setSetuidUndefined: Self = StObject.set(x, "setuid", js.undefined)
      
      inline def setSticky(value: PermissionObjectValue): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
  
  type PermissionObjectValue = js.UndefOr[Boolean]
  
  type PermissionOctal = /* template literal string: ${OctalStart}${OctalDigit} */ String
  
  type PermissionStat = /* template literal string: ${string}${PermissionStatOthersBit}${PermissionStatOthersBit}${PermissionStatOthersBit} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.`-_`
    - typings.unixPermissions.unixPermissionsStrings.r
    - typings.unixPermissions.unixPermissionsStrings.w
    - typings.unixPermissions.unixPermissionsStrings.x_
    - typings.unixPermissions.unixPermissionsStrings.X
    - typings.unixPermissions.unixPermissionsStrings.t_
    - typings.unixPermissions.unixPermissionsStrings.T
  */
  trait PermissionStatOthersBit extends StObject
  object PermissionStatOthersBit {
    
    inline def T: typings.unixPermissions.unixPermissionsStrings.T = "T".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.T]
    
    inline def X: typings.unixPermissions.unixPermissionsStrings.X = "X".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.X]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def r: typings.unixPermissions.unixPermissionsStrings.r = "r".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.r]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def w: typings.unixPermissions.unixPermissionsStrings.w = "w".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.w]
    
    inline def x: x_ = "x".asInstanceOf[x_]
  }
  
  type PermissionSymbolic = /* template literal string: ${PermissionSymbolicSingle} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.x_
    - typings.unixPermissions.unixPermissionsStrings.w
    - typings.unixPermissions.unixPermissionsStrings.r
    - typings.unixPermissions.unixPermissionsStrings.X
    - typings.unixPermissions.unixPermissionsStrings.s
    - typings.unixPermissions.unixPermissionsStrings.t_
  */
  trait PermissionSymbolicAction extends StObject
  object PermissionSymbolicAction {
    
    inline def X: typings.unixPermissions.unixPermissionsStrings.X = "X".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.X]
    
    inline def r: typings.unixPermissions.unixPermissionsStrings.r = "r".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.r]
    
    inline def s: typings.unixPermissions.unixPermissionsStrings.s = "s".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.s]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def w: typings.unixPermissions.unixPermissionsStrings.w = "w".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.w]
    
    inline def x: x_ = "x".asInstanceOf[x_]
  }
  
  type PermissionSymbolicActions = _empty | (/* template literal string: ${string}${PermissionSymbolicAction} */ String)
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.a
    - typings.unixPermissions.unixPermissionsStrings.u
    - typings.unixPermissions.unixPermissionsStrings.g
    - typings.unixPermissions.unixPermissionsStrings.o
  */
  trait PermissionSymbolicClass extends StObject
  object PermissionSymbolicClass {
    
    inline def a: typings.unixPermissions.unixPermissionsStrings.a = "a".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.a]
    
    inline def g: typings.unixPermissions.unixPermissionsStrings.g = "g".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.g]
    
    inline def o: typings.unixPermissions.unixPermissionsStrings.o = "o".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.o]
    
    inline def u: typings.unixPermissions.unixPermissionsStrings.u = "u".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.u]
  }
  
  type PermissionSymbolicClasses = _empty | (/* template literal string: ${string}${PermissionSymbolicClass} */ String)
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.Plussign
    - typings.unixPermissions.unixPermissionsStrings.Equalssign
    - typings.unixPermissions.unixPermissionsStrings.`-_`
  */
  trait PermissionSymbolicOperator extends StObject
  object PermissionSymbolicOperator {
    
    inline def Equalssign: typings.unixPermissions.unixPermissionsStrings.Equalssign = "=".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.Equalssign]
    
    inline def Plussign: typings.unixPermissions.unixPermissionsStrings.Plussign = "+".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.Plussign]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  
  type PermissionSymbolicSingle = /* template literal string: ${PermissionSymbolicClasses}${PermissionSymbolicOperator}${PermissionSymbolicActions} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.unixPermissions.unixPermissionsStrings.octal
    - typings.unixPermissions.unixPermissionsStrings.number
    - typings.unixPermissions.unixPermissionsStrings.stat
    - typings.unixPermissions.unixPermissionsStrings.symbolic
    - typings.unixPermissions.unixPermissionsStrings.`object`
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    inline def number: typings.unixPermissions.unixPermissionsStrings.number = "number".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.number]
    
    inline def `object`: typings.unixPermissions.unixPermissionsStrings.`object` = "object".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.`object`]
    
    inline def octal: typings.unixPermissions.unixPermissionsStrings.octal = "octal".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.octal]
    
    inline def stat: typings.unixPermissions.unixPermissionsStrings.stat = "stat".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.stat]
    
    inline def symbolic: typings.unixPermissions.unixPermissionsStrings.symbolic = "symbolic".asInstanceOf[typings.unixPermissions.unixPermissionsStrings.symbolic]
  }
  
  trait _OctalPrefix extends StObject
}
