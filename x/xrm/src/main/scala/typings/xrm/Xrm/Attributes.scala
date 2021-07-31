package typings.xrm.Xrm

import typings.std.Date
import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Controls.DateControl
import typings.xrm.Xrm.Controls.LookupControl
import typings.xrm.Xrm.Controls.NumberControl
import typings.xrm.Xrm.Controls.OptionSetControl
import typings.xrm.Xrm.Controls.StringControl
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of types and methods for working with formContext attributes.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
  */
object Attributes {
  
  /**
    * Interface for an Entity attribute.
    */
  trait Attribute extends StObject {
    
    /**
      * Adds a handler to be called when the attribute's value is changed.
      * @param handler The function reference.
      */
    def addOnChange(handler: ContextSensitiveHandler): Unit
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    var controls: ItemCollection[Control]
    
    /**
      * Fire all "on change" event handlers.
      */
    def fireOnChange(): Unit
    
    /**
      * Gets attribute type.
      * @returns The attribute's type name.<BR><BR>
      * **Values returned are**:
      * * boolean
      * * datetime
      * * decimal
      * * double
      * * integer
      * * lookup
      * * memo
      * * money
      * * optionset
      * * string
      */
    def getAttributeType(): AttributeType
    
    /**
      * Gets the attribute format.
      * @returns The format of the attribute.<BR><BR>
      * **Values returned are**:
      * * date           (datetime)
      * * datetime       (datetime)
      * * duration       (integer)
      * * email          (string)
      * * language       (optionset)
      * * none           (integer)
      * * phone          (string)
      * * text           (string)
      * * textarea       (string)
      * * tickersymbol   (string)
      * * timezone       (optionset)
      * * url            (string)
      * @see {@link getAttributeType}
      */
    def getFormat(): AttributeFormat
    
    /**
      * Gets a boolean value indicating whether this Attribute has unsaved changes.
      * @returns true if there are unsaved changes, otherwise false.
      */
    def getIsDirty(): Boolean
    
    /**
      * Gets the logical name of the attribute.
      * @returns The logical name.
      */
    def getName(): String
    
    /**
      * Gets a reference to the record context of this attribute.
      * @returns The parent record context.
      */
    def getParent(): Entity
    
    /**
      * Gets the current level of requirement for the attribute.
      * @returns The required level, as either "none", "required", or "recommended"
      */
    def getRequiredLevel(): RequirementLevel
    
    /**
      * Gets current submit mode for the attribute.
      * @returns The submit mode, as either "always", "never", or "dirty"
      * @remarks The default value is "dirty"
      */
    def getSubmitMode(): SubmitMode
    
    /**
      * Gets the current user's privileges for the attribute.
      * @returns The user privileges.
      */
    def getUserPrivilege(): Privilege
    
    /**
      * Gets the value.
      * @returns The value.
      */
    def getValue(): js.Any
    
    /**
      * Removes the handler from the "on change" event.
      * @param handler The handler.
      */
    def removeOnChange(handler: ContextSensitiveHandler): Unit
    
    /**
      * Sets the required level.
      * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
      * @see {@link XrmEnum.AttributeRequirementLevel}
      */
    def setRequiredLevel(requirementLevel: RequirementLevel): Unit
    
    /**
      * Sets the submit mode.
      * @param submitMode The submit mode, as either "always", "never", or "dirty".
      * @default submitMode "dirty"
      * @see {@link XrmEnum.AttributeRequirementLevel}
      */
    def setSubmitMode(submitMode: SubmitMode): Unit
    
    /**
      * Sets the value.
      * @param value The value.
      */
    def setValue(value: js.Any): Unit
  }
  object Attribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[Control],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getIsDirty: () => Boolean,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: js.Any => Unit
    ): Attribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOnChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "addOnChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setControls(value: ItemCollection[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireOnChange(value: () => Unit): Self = StObject.set(x, "fireOnChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttributeType(value: () => AttributeType): Self = StObject.set(x, "getAttributeType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFormat(value: () => AttributeFormat): Self = StObject.set(x, "getFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsDirty(value: () => Boolean): Self = StObject.set(x, "getIsDirty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Entity): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRequiredLevel(value: () => RequirementLevel): Self = StObject.set(x, "getRequiredLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubmitMode(value: () => SubmitMode): Self = StObject.set(x, "getSubmitMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserPrivilege(value: () => Privilege): Self = StObject.set(x, "getUserPrivilege", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveOnChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "removeOnChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRequiredLevel(value: RequirementLevel => Unit): Self = StObject.set(x, "setRequiredLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSubmitMode(value: SubmitMode => Unit): Self = StObject.set(x, "setSubmitMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
    * @see {@link XrmEnum.DateAttributeFormat}
    * @see {@link XrmEnum.IntegerAttributeFormat}
    * @see {@link XrmEnum.OptionSetAttributeFormat}
    * @see {@link XrmEnum.StringAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.date
    - typings.xrm.xrmStrings.datetime
    - typings.xrm.xrmStrings.duration
    - typings.xrm.xrmStrings.none
    - typings.xrm.xrmStrings.language
    - typings.xrm.xrmStrings.timezone
    - typings.xrm.xrmStrings.email
    - typings.xrm.xrmStrings.phone
    - typings.xrm.xrmStrings.text
    - typings.xrm.xrmStrings.textarea
    - typings.xrm.xrmStrings.tickersymbol
    - typings.xrm.xrmStrings.url
  */
  trait AttributeFormat extends StObject
  object AttributeFormat {
    
    @scala.inline
    def date: typings.xrm.xrmStrings.date = "date".asInstanceOf[typings.xrm.xrmStrings.date]
    
    @scala.inline
    def datetime: typings.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typings.xrm.xrmStrings.datetime]
    
    @scala.inline
    def duration: typings.xrm.xrmStrings.duration = "duration".asInstanceOf[typings.xrm.xrmStrings.duration]
    
    @scala.inline
    def email: typings.xrm.xrmStrings.email = "email".asInstanceOf[typings.xrm.xrmStrings.email]
    
    @scala.inline
    def language: typings.xrm.xrmStrings.language = "language".asInstanceOf[typings.xrm.xrmStrings.language]
    
    @scala.inline
    def none: typings.xrm.xrmStrings.none = "none".asInstanceOf[typings.xrm.xrmStrings.none]
    
    @scala.inline
    def phone: typings.xrm.xrmStrings.phone = "phone".asInstanceOf[typings.xrm.xrmStrings.phone]
    
    @scala.inline
    def text: typings.xrm.xrmStrings.text = "text".asInstanceOf[typings.xrm.xrmStrings.text]
    
    @scala.inline
    def textarea: typings.xrm.xrmStrings.textarea = "textarea".asInstanceOf[typings.xrm.xrmStrings.textarea]
    
    @scala.inline
    def tickersymbol: typings.xrm.xrmStrings.tickersymbol = "tickersymbol".asInstanceOf[typings.xrm.xrmStrings.tickersymbol]
    
    @scala.inline
    def timezone: typings.xrm.xrmStrings.timezone = "timezone".asInstanceOf[typings.xrm.xrmStrings.timezone]
    
    @scala.inline
    def url: typings.xrm.xrmStrings.url = "url".asInstanceOf[typings.xrm.xrmStrings.url]
  }
  
  /**
    * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
    * @see {@link XrmEnum.AttributeType}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.boolean
    - typings.xrm.xrmStrings.datetime
    - typings.xrm.xrmStrings.decimal
    - typings.xrm.xrmStrings.double
    - typings.xrm.xrmStrings.integer
    - typings.xrm.xrmStrings.lookup
    - typings.xrm.xrmStrings.memo
    - typings.xrm.xrmStrings.money
    - typings.xrm.xrmStrings.multiselectoptionset
    - typings.xrm.xrmStrings.optionset
    - typings.xrm.xrmStrings.string
  */
  trait AttributeType extends StObject
  object AttributeType {
    
    @scala.inline
    def boolean: typings.xrm.xrmStrings.boolean = "boolean".asInstanceOf[typings.xrm.xrmStrings.boolean]
    
    @scala.inline
    def datetime: typings.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typings.xrm.xrmStrings.datetime]
    
    @scala.inline
    def decimal: typings.xrm.xrmStrings.decimal = "decimal".asInstanceOf[typings.xrm.xrmStrings.decimal]
    
    @scala.inline
    def double: typings.xrm.xrmStrings.double = "double".asInstanceOf[typings.xrm.xrmStrings.double]
    
    @scala.inline
    def integer: typings.xrm.xrmStrings.integer = "integer".asInstanceOf[typings.xrm.xrmStrings.integer]
    
    @scala.inline
    def lookup: typings.xrm.xrmStrings.lookup = "lookup".asInstanceOf[typings.xrm.xrmStrings.lookup]
    
    @scala.inline
    def memo: typings.xrm.xrmStrings.memo = "memo".asInstanceOf[typings.xrm.xrmStrings.memo]
    
    @scala.inline
    def money: typings.xrm.xrmStrings.money = "money".asInstanceOf[typings.xrm.xrmStrings.money]
    
    @scala.inline
    def multiselectoptionset: typings.xrm.xrmStrings.multiselectoptionset = "multiselectoptionset".asInstanceOf[typings.xrm.xrmStrings.multiselectoptionset]
    
    @scala.inline
    def optionset: typings.xrm.xrmStrings.optionset = "optionset".asInstanceOf[typings.xrm.xrmStrings.optionset]
    
    @scala.inline
    def string: typings.xrm.xrmStrings.string = "string".asInstanceOf[typings.xrm.xrmStrings.string]
  }
  
  /**
    * Interface for a Boolean attribute.
    * @see {@link EnumAttribute}
    */
  trait BooleanAttribute
    extends StObject
       with EnumAttribute {
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks Attributes on Quick Create Forms will not save values set with this method.
      */
    def setValue(value: Boolean): Unit
  }
  object BooleanAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[Control],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getInitialValue: () => Double | Boolean,
      getIsDirty: () => Boolean,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: Boolean => Unit
    ): BooleanAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getInitialValue = js.Any.fromFunction0(getInitialValue), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[BooleanAttribute]
    }
    
    @scala.inline
    implicit class BooleanAttributeMutableBuilder[Self <: BooleanAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetValue(value: Boolean => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface for a Date attribute.
    *
    * @see {@link Attribute}
    */
  trait DateAttribute
    extends StObject
       with Attribute {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_DateAttribute: ItemCollection[DateControl]
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks Attributes on Quick Create Forms will not save values set with this method.
      */
    def setValue(value: Date): Unit
  }
  object DateAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[DateControl],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getIsDirty: () => Boolean,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: Date => Unit
    ): DateAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[DateAttribute]
    }
    
    @scala.inline
    implicit class DateAttributeMutableBuilder[Self <: DateAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: ItemCollection[DateControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetValue(value: Date => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
    * @see {@link XrmEnum.DateAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.date
    - typings.xrm.xrmStrings.datetime
  */
  trait DateAttributeFormat extends StObject
  object DateAttributeFormat {
    
    @scala.inline
    def date: typings.xrm.xrmStrings.date = "date".asInstanceOf[typings.xrm.xrmStrings.date]
    
    @scala.inline
    def datetime: typings.xrm.xrmStrings.datetime = "datetime".asInstanceOf[typings.xrm.xrmStrings.datetime]
  }
  
  /**
    * Common interface for enumeration attributes (OptionSet and Boolean).
    * @see {@link Attribute}
    */
  trait EnumAttribute
    extends StObject
       with Attribute {
    
    /**
      * Gets the initial value of the attribute.
      * @returns The initial value.
      * @remarks Valid for OptionSet and boolean attribute types
      */
    def getInitialValue(): Double | Boolean
  }
  object EnumAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[Control],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getInitialValue: () => Double | Boolean,
      getIsDirty: () => Boolean,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: js.Any => Unit
    ): EnumAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getInitialValue = js.Any.fromFunction0(getInitialValue), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[EnumAttribute]
    }
    
    @scala.inline
    implicit class EnumAttributeMutableBuilder[Self <: EnumAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInitialValue(value: () => Double | Boolean): Self = StObject.set(x, "getInitialValue", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
    * @see {@link XrmEnum.IntegerAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.duration
    - typings.xrm.xrmStrings.none
  */
  trait IntegerAttributeFormat extends StObject
  object IntegerAttributeFormat {
    
    @scala.inline
    def duration: typings.xrm.xrmStrings.duration = "duration".asInstanceOf[typings.xrm.xrmStrings.duration]
    
    @scala.inline
    def none: typings.xrm.xrmStrings.none = "none".asInstanceOf[typings.xrm.xrmStrings.none]
  }
  
  /**
    * Interface a Lookup attribute.
    *
    * @see {@link Attribute}
    */
  trait LookupAttribute
    extends StObject
       with Attribute {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_LookupAttribute: ItemCollection[LookupControl]
    
    /**
      * Gets a boolean value indicating whether the Lookup is a multi-value PartyList.
      * @returns true the attribute is a PartyList, otherwise false.
      */
    def getIsPartyList(): Boolean
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks Attributes on Quick Create Forms will not save values set with this method.
      */
    def setValue(value: js.Array[LookupValue]): Unit
  }
  object LookupAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[LookupControl],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getIsDirty: () => Boolean,
      getIsPartyList: () => Boolean,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: js.Array[LookupValue] => Unit
    ): LookupAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getIsPartyList = js.Any.fromFunction0(getIsPartyList), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[LookupAttribute]
    }
    
    @scala.inline
    implicit class LookupAttributeMutableBuilder[Self <: LookupAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: ItemCollection[LookupControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetIsPartyList(value: () => Boolean): Self = StObject.set(x, "getIsPartyList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: js.Array[LookupValue] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface for a Number attribute.
    * @see {@link Attribute}
    */
  trait NumberAttribute
    extends StObject
       with Attribute {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_NumberAttribute: ItemCollection[NumberControl]
    
    /**
      * Gets the maximum value allowed.
      * @returns The maximum value allowed.
      */
    def getMax(): Double
    
    /**
      * Gets the minimum value allowed.
      * @returns The minimum value allowed.
      */
    def getMin(): Double
    
    /**
      * Gets the attribute's configured precision.
      * @returns The total number of allowed decimal places.
      */
    def getPrecision(): Double
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks Attributes on Quick Create Forms will not save values set with this method.
      */
    def setValue(value: Double): Unit
  }
  object NumberAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[NumberControl],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getIsDirty: () => Boolean,
      getMax: () => Double,
      getMin: () => Double,
      getName: () => String,
      getParent: () => Entity,
      getPrecision: () => Double,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: Double => Unit
    ): NumberAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPrecision = js.Any.fromFunction0(getPrecision), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[NumberAttribute]
    }
    
    @scala.inline
    implicit class NumberAttributeMutableBuilder[Self <: NumberAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: ItemCollection[NumberControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMax(value: () => Double): Self = StObject.set(x, "getMax", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMin(value: () => Double): Self = StObject.set(x, "getMin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrecision(value: () => Double): Self = StObject.set(x, "getPrecision", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface an OptionSet attribute.
    * @see {@link EnumAttribute}
    */
  @js.native
  trait OptionSetAttribute
    extends StObject
       with EnumAttribute {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_OptionSetAttribute: ItemCollection[OptionSetControl] = js.native
    
    /**
      * Gets the option matching a label.
      * @param label The label of the option desired.
      * @returns The option.
      */
    def getOption(label: String): OptionSetValue = js.native
    /**
      * Gets the option matching a value.
      * @param value The enumeration value of the option desired.
      * @returns The option.
      */
    def getOption(value: Double): OptionSetValue = js.native
    
    /**
      * Gets all of the options.
      * @returns An array of options.
      */
    def getOptions(): js.Array[OptionSetValue] = js.native
    
    /**
      * Gets selected option.
      * @returns The selected option.
      */
    def getSelectedOption(): OptionSetValue = js.native
    
    /**
      * Gets the label of the currently selected option.
      * @returns The current value's label.
      */
    def getText(): String = js.native
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks     The getOptions() method returns option values as strings. You must use parseInt
      *              to convert them to numbers before you can use those values to set the value of an
      *              OptionSet attribute. Attributes on Quick Create Forms will not save values set
      *              with this method.
      */
    def setValue(value: Double): Unit = js.native
  }
  
  /**
    * OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
    * @see {@link XrmEnum.OptionSetAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.language
    - typings.xrm.xrmStrings.timezone
  */
  trait OptionSetAttributeFormat extends StObject
  object OptionSetAttributeFormat {
    
    @scala.inline
    def language: typings.xrm.xrmStrings.language = "language".asInstanceOf[typings.xrm.xrmStrings.language]
    
    @scala.inline
    def timezone: typings.xrm.xrmStrings.timezone = "timezone".asInstanceOf[typings.xrm.xrmStrings.timezone]
  }
  
  /**
    * Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
    * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.none
    - typings.xrm.xrmStrings.recommended
    - typings.xrm.xrmStrings.required
  */
  trait RequirementLevel extends StObject
  object RequirementLevel {
    
    @scala.inline
    def none: typings.xrm.xrmStrings.none = "none".asInstanceOf[typings.xrm.xrmStrings.none]
    
    @scala.inline
    def recommended: typings.xrm.xrmStrings.recommended = "recommended".asInstanceOf[typings.xrm.xrmStrings.recommended]
    
    @scala.inline
    def required: typings.xrm.xrmStrings.required = "required".asInstanceOf[typings.xrm.xrmStrings.required]
  }
  
  /**
    * Interface for a String attribute.
    * @see {@link Attribute}
    */
  trait StringAttribute
    extends StObject
       with Attribute {
    
    /**
      * A collection of all the controls on the form that interface with this attribute.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    @JSName("controls")
    var controls_StringAttribute: ItemCollection[StringControl]
    
    /**
      * Gets maximum length allowed.
      * @returns The maximum length allowed.
      * @remarks The email form's "Description" attribute does not have the this method.
      */
    def getMaxLength(): Double
    
    /**
      * Sets the value.
      * @param value The value.
      * @remarks A String field with the {@link Attribute.getFormat|email} format enforces email
      *          address formatting. Attributes on Quick Create Forms will not save values set
      *          with this method.
      */
    def setValue(value: String): Unit
  }
  object StringAttribute {
    
    @scala.inline
    def apply(
      addOnChange: ContextSensitiveHandler => Unit,
      controls: ItemCollection[StringControl],
      fireOnChange: () => Unit,
      getAttributeType: () => AttributeType,
      getFormat: () => AttributeFormat,
      getIsDirty: () => Boolean,
      getMaxLength: () => Double,
      getName: () => String,
      getParent: () => Entity,
      getRequiredLevel: () => RequirementLevel,
      getSubmitMode: () => SubmitMode,
      getUserPrivilege: () => Privilege,
      getValue: () => js.Any,
      removeOnChange: ContextSensitiveHandler => Unit,
      setRequiredLevel: RequirementLevel => Unit,
      setSubmitMode: SubmitMode => Unit,
      setValue: String => Unit
    ): StringAttribute = {
      val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getMaxLength = js.Any.fromFunction0(getMaxLength), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[StringAttribute]
    }
    
    @scala.inline
    implicit class StringAttributeMutableBuilder[Self <: StringAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: ItemCollection[StringControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMaxLength(value: () => Double): Self = StObject.set(x, "getMaxLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
    * @see {@link XrmEnum.StringAttributeFormat}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.email
    - typings.xrm.xrmStrings.phone
    - typings.xrm.xrmStrings.text
    - typings.xrm.xrmStrings.textarea
    - typings.xrm.xrmStrings.tickersymbol
    - typings.xrm.xrmStrings.url
  */
  trait StringAttributeFormat extends StObject
  object StringAttributeFormat {
    
    @scala.inline
    def email: typings.xrm.xrmStrings.email = "email".asInstanceOf[typings.xrm.xrmStrings.email]
    
    @scala.inline
    def phone: typings.xrm.xrmStrings.phone = "phone".asInstanceOf[typings.xrm.xrmStrings.phone]
    
    @scala.inline
    def text: typings.xrm.xrmStrings.text = "text".asInstanceOf[typings.xrm.xrmStrings.text]
    
    @scala.inline
    def textarea: typings.xrm.xrmStrings.textarea = "textarea".asInstanceOf[typings.xrm.xrmStrings.textarea]
    
    @scala.inline
    def tickersymbol: typings.xrm.xrmStrings.tickersymbol = "tickersymbol".asInstanceOf[typings.xrm.xrmStrings.tickersymbol]
    
    @scala.inline
    def url: typings.xrm.xrmStrings.url = "url".asInstanceOf[typings.xrm.xrmStrings.url]
  }
}
