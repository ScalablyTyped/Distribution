package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  /**
           * It adds a project as library to your project by copying it over. 
           * The library will be a node with the given name directly 
           * under your project's ROOT. 
           * It becomes a read-only portion of your project. 
           * You will only be able to manipulate it with library functions, 
           * but cannot edit the individual nodes inside. 
           * However you will be able to instantiate or copy 
           * the nodes into other places of your project. 
           * Every node that was part of the META in the 
           * originating project becomes part of your project's meta.
           * 
           * @param node any regular node in your project.
           * @param name the name of the library you wish to use as a namespace in your project.
           * @param libraryRootHash the hash of your library's root (must exist in the project's collection at the time of call).
           * @param libraryInfo information about your project.
           */
  @JSName("addLibrary")
  var addLibrary_Original: webgmeLib.Anon_NodeNameLibraryRootHash = js.native
  /**
           * Apply changes to the current project.
           * @param root
           * @param patch
           * @return only reports errors.
           */
  @JSName("applyTreeDiff")
  var applyTreeDiff_Original: webgmeLib.Anon_Root = js.native
  /**
           * Generates a differential tree among the two states 
           * of the project that contains the necessary changes 
           * that can modify the source to be identical to the target. 
           * 
           * @param sourceRoot the root node of the source state.
           * @param targetRoot the root node of the target state.
           * @return the result is in form of a json object.
           */
  @JSName("generateTreeDiff")
  var generateTreeDiff_Original: webgmeLib.Anon_SourceRoot = js.native
  /**
           * From the given starting node, it loads the path 
           * given as a series of relative ids (separated by '/') and returns the node it finds at the ends of the path. 
           * If there is no node, the function will return null.
           * @param startNode the starting node of our search.
           * @param relativePath the relative path - built by relative ids - of the node in question.
           */
  @JSName("loadByPath")
  var loadByPath_Original: webgmeLib.Anon_StartNode = js.native
  /**
           * Loads the child of the given parent pointed by the relative id. 
           * Behind the scenes, it means that it actually loads the 
           * data pointed by a hash stored inside the parent under 
           * the given id and wraps it in a node object which will 
           * be connected to the parent as a child in the containment hierarchy. 
           * If there is no such relative id reserved, the call will return with null.
           * @param parent the container node in question.
           * @param relativeId the relative id of the child in question.
           */
  @JSName("loadChild")
  var loadChild_Original: webgmeLib.Anon_Parent = js.native
  /**
           * Loads all the children of the given parent. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           * @see https://github.com/webgme/webgme/wiki/GME-Core-API#containment-methods
           */
  @JSName("loadChildren")
  var loadChildren_Original: webgmeLib.Anon_ParentCallbackNode = js.native
  /**
           * Loads all the source nodes that has such a pointer and its target is the given node.
           * @param target the container node in question.
           * @param pointerName 
           * @return the relative id of the child in question.
           */
  @JSName("loadCollection")
  var loadCollection_Original: webgmeLib.Anon_Target = js.native
  /**
           * Loads all the instances of the given node.
           * @param node the node in question.
           */
  @JSName("loadInstances")
  var loadInstances_Original: webgmeLib.Anon_NodeCallback = js.native
  /**
           * Loads all the children of the given parent that has some data and not just inherited. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           */
  @JSName("loadOwnChildren")
  var loadOwnChildren_Original: webgmeLib.Anon_ParentCallback = js.native
  /**
           * Loads a complete sub-tree of the containment hierarchy starting from the given node, 
           * but load only those children that has some additional data and not purely inherited.
           * @param node the node in question.
           */
  @JSName("loadOwnSubTree")
  var loadOwnSubTree_Original: webgmeLib.Anon_NodeCallback = js.native
  /**
           * Loads the target of the given pointer of the given node. 
           * In the callback the node can have three values: 
           * if the node is valid, then it is the defined target of a valid pointer, 
           * if the returned value is null, then it means that the pointer is defined, but has no real target, 
           * finally if the returned value is undefined then there is no such pointer defined for the given node.
           * @param source the source node in question.
           * @param pointerName the relative id of the child in question.
           */
  @JSName("loadPointer")
  var loadPointer_Original: webgmeLib.Anon_Source = js.native
  /**
           * Loads the data object with the given hash and makes it a root of a containment hierarchy.
           * @param node the node in question.
           * @return 
           */
  @JSName("loadRoot")
  var loadRoot_Original: webgmeLib.Anon_MetadataHashCallbackResultCallbackDataObject = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  @JSName("loadSubTree")
  var loadSubTree_Original: webgmeLib.Anon_NodeCallbackResultCallback = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  @JSName("loadTree")
  var loadTree_Original: webgmeLib.Anon_RootHash = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  @JSName("setGuid")
  var setGuid_Original: webgmeLib.Anon_NodeGuid = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  @JSName("setMemberAttribute")
  var setMemberAttribute_Original: webgmeLib.Anon_NodeSetName = js.native
  /**
           * TODO
           * the visitation function will be called for
           * every node in the sub-tree, the second parameter of the function
           * is a callback that should be called to
           * note to the traversal function that the visitation for a given node is finished.
           *  @param node the node in question.
          * @return 
           */
  @JSName("traverse")
  var traverse_Original: webgmeLib.Anon_NodeOptions = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  @JSName("updateLibrary")
  var updateLibrary_Original: webgmeLib.Anon_NodeName = js.native
  /**
           * It adds a project as library to your project by copying it over. 
           * The library will be a node with the given name directly 
           * under your project's ROOT. 
           * It becomes a read-only portion of your project. 
           * You will only be able to manipulate it with library functions, 
           * but cannot edit the individual nodes inside. 
           * However you will be able to instantiate or copy 
           * the nodes into other places of your project. 
           * Every node that was part of the META in the 
           * originating project becomes part of your project's meta.
           * 
           * @param node any regular node in your project.
           * @param name the name of the library you wish to use as a namespace in your project.
           * @param libraryRootHash the hash of your library's root (must exist in the project's collection at the time of call).
           * @param libraryInfo information about your project.
           */
  def addLibrary(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: java.lang.String,
    libraryInfo: LibraryInfo
  ): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * It adds a project as library to your project by copying it over. 
           * The library will be a node with the given name directly 
           * under your project's ROOT. 
           * It becomes a read-only portion of your project. 
           * You will only be able to manipulate it with library functions, 
           * but cannot edit the individual nodes inside. 
           * However you will be able to instantiate or copy 
           * the nodes into other places of your project. 
           * Every node that was part of the META in the 
           * originating project becomes part of your project's meta.
           * 
           * @param node any regular node in your project.
           * @param name the name of the library you wish to use as a namespace in your project.
           * @param libraryRootHash the hash of your library's root (must exist in the project's collection at the time of call).
           * @param libraryInfo information about your project.
           */
  def addLibrary(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: java.lang.String,
    libraryInfo: LibraryInfo,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * Adds a member to the given set.
           * @param node the owner of the set.
           * @param name the name of the set.
           * @param member the new member of the set.
           * @return If the set is not allowed to be modified, 
           * the function returns an error.
           */
  def addMember(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, member: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Adds a mixin to the mixin set of the node.
           * @param node the node in question.
           * @param the path of the mixin node.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def addMixin(node: webgmeLib.CoreNs.Node, mixinPath: webgmeLib.GmeCommonNs.Path): js.UndefOr[nodeLib.Error] = js.native
  /**
           * When our attempt to merge two patches ended in some conflict, 
           * then we can modify that result highlighting that in case of every conflict, 
           * which side we prefer (mine vs. theirs). 
           * If we give that object as an input to this function, 
           * it will finish the merge resolving the conflict according 
           * our settings and present a final patch.
           * @param conflict the object that represents our 
           * settings for every conflict and the so-far-merged patch.
           * @return The function results in a tree structured patch 
           * object that contains the changes that cover both 
           * parties modifications 
           * (and the conflicts are resolved according the input settings).
           */
  def applyResolution(conflict: js.Object): js.Object = js.native
  /**
           * Apply changes to the current project.
           * @param root
           * @param patch
           * @return only reports errors.
           */
  def applyTreeDiff(root: webgmeLib.CoreNs.Node, patch: webgmeLib.CoreNs.DataObject): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * Apply changes to the current project.
           * @param root
           * @param patch
           * @return only reports errors.
           */
  def applyTreeDiff(
    root: webgmeLib.CoreNs.Node,
    patch: webgmeLib.CoreNs.DataObject,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * Checks if the given path can be added as a mixin to the given node.
           * @param node the node in question.
           * @param mixinPath the path of the mixin node.
           * @return Returns if the mixin could be added, or the reason why it is not.
           */
  def canSetAsMixin(node: webgmeLib.CoreNs.Node, mixinPath: webgmeLib.GmeCommonNs.Path): scala.Boolean | java.lang.String = js.native
  /**
           * Removes all META rules that were specifically defined for the node 
           * (so the function do not touches inherited rules).
           * @param node the node in question.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def clearMetaRules(node: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes all mixins for a given node.
           * @param node the node in question.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def clearMixins(node: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Copies the given node into parent.
           * @param node the node to be copied.
           * @param parent the target parent where the copy will be placed.
           * @return The function returns the copied node or an error if the copy is not allowed.
           */
  def copyNode(node: webgmeLib.CoreNs.Node, parent: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | nodeLib.Error = js.native
  /**
           * Copies the given nodes into parent.
           * @param nodes the nodes to be copied.
           * @param parent the target parent where the copies will be placed.
           * @return The function returns an array of the copied nodes or an error 
           * if any of the nodes are not allowed to be copied to the given parent.
           */
  def copyNodes(nodes: js.Array[webgmeLib.CoreNs.Node], parent: webgmeLib.CoreNs.Node): js.Array[webgmeLib.CoreNs.Node] | nodeLib.Error = js.native
  /**
           * Creates a node according to the given parameters.
           * @param parameters the details of the creation.
           * @return The function returns the created node or null if no node was 
           * created or an error if the creation with the given parameters are not allowed.
           */
  def createNode(parameters: NodeParameters): webgmeLib.CoreNs.Node | nodeLib.Error = js.native
  /**
           * Creates a set for the node.
           * @param node the node that will own the set.
           * @param name the name of the set.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def createSet(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the given aspect rule of the node.
           * @param node the node whose aspect rule will be deleted.
           * @param name the name of the aspect rule.
           * @return  If the node is not allowed to be modified, the function returns an error.
           */
  def delAspectMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a valid type from the given aspect of the node.
           * @param node the node in question.
           * @param name the name of the aspect rule.
           * @param targetPath the absolute path of the valid type of the aspect.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delAspectMetaTarget(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    targetPath: webgmeLib.GmeCommonNs.Path
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the given attributes from the given node.
           * @param node the node in question.
           * @param name the name of the attribute.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delAttribute(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes an attribute definition from the META rules of the node.
           * @param name the node in question.
           * @param name the name of the attribute.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delAttributeMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the given child rule from the node.
           * @param the node in question.
           * @param childPath the absolute path of the child which rule is to be removed from the node.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delChildMeta(node: webgmeLib.CoreNs.Node, childPath: webgmeLib.GmeCommonNs.Path): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a constraint from the node.
           * @param node the node in question.
           * @param name the name of the constraint.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delConstraint(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a member from the set. The functions doesn't remove the node itself.
           * @param node the node in question.
           * @param name the name of the set.
           * @param path the path to the member to be removed.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delMember(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, path: webgmeLib.GmeCommonNs.Path): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes an attribute which represented a property of the given set membership.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param memberPath the path to the member to be removed.
           * @param attrName the name of the attribute.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delMemberAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path,
    attrName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a registry entry which represented a property of the given set membership.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param memberPath the path to the member to be removed.
           * @param regName the name of the registry entry.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def delMemberRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path,
    regName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a mixin from the mixin set of the node.
           * @param node the node in question.
           * @param mixinPath the path of the mixin node.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delMixin(node: webgmeLib.CoreNs.Node, mixinPath: webgmeLib.GmeCommonNs.Path): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the complete META rule regarding the given pointer/set of the node.
           * @param node the node in question.
           * @param name the name of the pointer/set.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delPointerMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a possible target type from the pointer/set of the node.
           * @param node the node in question.
           * @param name the name of the pointer/set.
           * @param targetPath the absolute path of the possible target type.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delPointerMetaTarget(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, targetPath: java.lang.String): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the given registry entry from the given node.
           * @param node the node in question.
           * @param name the name of the registry entry.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delRegistry(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the attribute entry for the set at the node.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param attrName the name of the attribute entry.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delSetAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    attrName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the registry entry for the set at the node.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param regName the name of the registry entry.
           * @return If the node is not allowed to be modified, the function returns an error. 
           */
  def delSetRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    regName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a node from the containment hierarchy.
           * It also removes all contained nodes.
           * @param node the node in question.
           * @return If the operation is not allowed it returns an error.
           */
  def deleteNode(node: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes the pointer from the node.
           * @param node the node in question.
           * @param name the name of the pointer.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def deletePointer(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Removes a set from the node.
           * @param node the node in question.
           * @param name the name of the set.
           * @return If the node is not allowed to be modified, the function returns an error.
           */
  def deleteSet(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * Generates a differential tree among the two states 
           * of the project that contains the necessary changes 
           * that can modify the source to be identical to the target. 
           * 
           * @param sourceRoot the root node of the source state.
           * @param targetRoot the root node of the target state.
           * @return the result is in form of a json object.
           */
  def generateTreeDiff(sourceRoot: webgmeLib.CoreNs.Node, targetRoot: webgmeLib.CoreNs.Node): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * Generates a differential tree among the two states 
           * of the project that contains the necessary changes 
           * that can modify the source to be identical to the target. 
           * 
           * @param sourceRoot the root node of the source state.
           * @param targetRoot the root node of the target state.
           * @return the result is in form of a json object.
           */
  def generateTreeDiff(
    sourceRoot: webgmeLib.CoreNs.Node,
    targetRoot: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * Returns all META nodes.
           * @param node any node of the containment hierarchy.
           * @return the function returns a dictionary. 
           * The keys of the dictionary are the absolute 
           * paths of the META nodes of the project. 
           * Every value of the dictionary is a module:Core~Node.
           */
  def getAllMetaNodes(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Dictionary[webgmeLib.CoreNs.Node] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @param {Core.Node} target
           * @return {GmeCommon.MetaInfo}
           */
  def getAspectDefinitionInfo(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaInfo = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {Core.Node}
           */
  def getAspectDefinitionOwner(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.Node = js.native
  /**
           * Returns the list of valid children types of the given aspect.
           * @param node the node in question
           * @param name the name of the aspect.
           * @return the function returns a list of absolute paths 
           * of nodes that are valid children of the node and fits 
           * to the META rules defined for the aspect. 
           * Any children, visible under the given aspect of 
           * the node must be an instance of at least one node 
           * represented by the absolute paths.
           */
  def getAspectMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
          * Retrieves the value of the given attribute of the given node.
          * @param node - the node in question.
          * @param name - the name of the attribute.
          *
          * @return The function returns the value of the attribute of the node.
          * The retrieved attribute should not be modified as is - it should be copied first!
          * The value can be an object or any primitive type.
          * If the return value is undefined; the node does not have such attribute defined.
          * If the node is undefined the returned value is null.
          */
  def getAttribute(node: scala.Null, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
          * Retrieves the value of the given attribute of the given node.
          * @param node - the node in question.
          * @param name - the name of the attribute.
          *
          * @return The function returns the value of the attribute of the node.
          * The retrieved attribute should not be modified as is - it should be copied first!
          * The value can be an object or any primitive type.
          * If the return value is undefined; the node does not have such attribute defined.
          * If the node is undefined the returned value is null.
          */
  def getAttribute(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {Core.Node}
           */
  def getAttributeDefinitionOwner(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.Node = js.native
  /**
           * Returns the definition object of an attribute from the META rules of the node.
           * @param node the node in question.
           * @param name the name of the attribute.
           * @return The function returns the definition object, where type is always defined.
           */
  def getAttributeMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.DefObject = js.native
  /** 
           * Get the defined attribute names for the node.
           * @param node the node in question.
           * @return The function returns an array of the names of the attributes of the node.
           */
  def getAttributeNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /** 
           * Get the base node 
           * @param node the node in question.
           * @return the base of the given node or null if there is no such node.
           */
  def getBase(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | scala.Null = js.native
  /** 
           * Get the base node at the top of the inheritance chain.
           * @param node the node in question.
           * @return the root of the inheritance chain (usually the FCO). 
           */
  def getBaseRoot(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node = js.native
  /** 
           * Get the most specific meta node;
           * the closest META node of the node in question. 
           * @param node the node in question.
           * @return the first node (including itself) among the 
           * inheritance chain that is a META node. 
           * It returns null if it does not find such node 
           * (ideally the only node with this result is the ROOT).
           */
  def getBaseType(): webgmeLib.CoreNs.Node | scala.Null = js.native
  /** 
           * Get the most specific meta node;
           * the closest META node of the node in question. 
           * @param node the node in question.
           * @return the first node (including itself) among the 
           * inheritance chain that is a META node. 
           * It returns null if it does not find such node 
           * (ideally the only node with this result is the ROOT).
           */
  def getBaseType(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | scala.Null = js.native
  /** 
           * Get the most specific meta nodes;
           * Searches for the closest META node of the 
           * node in question and the direct mixins of that node. 
           * @param node the node in question.
           * @return the closest Meta node that is a base of the 
           * given node plus it returns all the mixin nodes 
           * associated with the base in a path-node dictionary.
           */
  def getBaseTypes(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Dictionary[webgmeLib.CoreNs.Node] | scala.Null = js.native
  /**
           * Retrieves the child of the input node at the given relative id.
           * It is not an asynchronous load and it automatically creates 
           * the child under the given relative id if no child was there 
           * beforehand.
           * @param node the node in question.
           * @param relativeId the relative id of the child in question.
           * @return an empty node if it was created as a result 
           * of the function or return the already existing 
           * and loaded node if it found.
           */
  def getChild(node: webgmeLib.CoreNs.Node, relativeId: java.lang.String): webgmeLib.CoreNs.Node = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {Core.Node} target
           * @return {GmeCommon.MetaInfo}
           */
  def getChildDefinitionInfo(node: webgmeLib.CoreNs.Node, target: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaInfo = js.native
  /**
           * Collects the data hash values of the children of the node.
           * @param node the node in question.
           * @return a dictionary of module:Core~ObjectHash that stored in 
           * pair with the relative id of the corresponding child of the node.
           */
  def getChildrenHashes(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /**
           * Return a JSON representation of the META rules 
           * regarding the valid children of the given node.
           * @param node the node in question.
           * @return a detailed JSON structure that represents the 
           * META rules regarding the possible children of the node.
           */
  def getChildrenMeta(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.RelationRule = js.native
  /** 
           * Collects the paths of all the children of the given node.
           * @param node the node in question.
           * @return an array of the absolute paths of the children.
           */
  def getChildrenPaths(parent: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Collects the relative ids of all the children of the given node.
           * @param parent the container node in question.
           * @return an array of the relative ids.
           */
  def getChildrenRelids(parent: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.RelId] = js.native
  /**
           * Retrieves a list of the defined pointer names that has the node as target.
           * @param node the node in question.
           * @return an array of the names of the pointers pointing to the node.
           */
  def getCollectionNames(node: webgmeLib.CoreNs.Node): js.Array[java.lang.String] = js.native
  /**
           * Retrieves a list of absolute paths of nodes that has a 
           * given pointer which points to the given node.
           * @param node the node in question.
           * @param name the name of the pointer.
           * @return an array of absolute paths of nodes having
           *  pointers pointing to the node.
           */
  def getCollectionPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Gets a constraint object of the node.
           * @param node the node in question.
           * @param name the name of the constraint.
           * @return the defined constraint or null if it was not defined for the node
           */
  def getConstraint(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.Constraint | scala.Null = js.native
  /**
           * Retrieves the list of constraint names defined for the node.
           * @param node the node in question.
           * @return the array of names of constraints available for the node.
           */
  def getConstraintNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Return the root of the inheritance chain of your Meta nodes.
           * @param node the node in question.
           * @return the acting FCO of your project.
           */
  def getFCO(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node = js.native
  /**
           * @param node the node in question.
           * @return the fully qualified name of the node, 
           * which is the list of its namespaces separated 
           * by dot and followed by the name of the node.
           */
  def getFullyQualifiedName(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Name = js.native
  /**
           * @param node the node in question.
           * @return the globally unique identifier for the node.
           */
  def getGuid(): webgmeLib.CoreNs.GUID = js.native
  /**
           * @param node the node in question.
           * @return the globally unique identifier for the node.
           */
  def getGuid(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.GUID = js.native
  /**
           * Returns the calculated database id of the data of the node.
           * @param node the node in question.
           * @return the so called Hash value of the data of the given node.
           *  If the string is empty, then it means that the 
           *  node was mutated but not yet saved to the database, 
           *  so it does not have a hash temporarily.
           */
  def getHash(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetadataHash = js.native
  /**
           * Collects the paths of all the instances of the given node.
           * @param node the node in question.
           * @return an array of the absolute paths of the instances.
           */
  def getInstancePaths(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Gives a JSON representation of the META rules of the node.
           * @param node the node in question.
           * @return an object that represents all the META rules of the node.
           */
  def getJsonMeta(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaRules = js.native
  /**
           * Returns the origin GUID of any library node.
           * @param node the node in question.
           * @param name of the library where we want to deduct the GUID from. 
           * If not given, than the GUID is computed from the 
           * direct library root of the node
           * @return the origin GUID of the node or error if the query cannot be fulfilled.
           */
  def getLibraryGuid(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.GUID | nodeLib.Error = js.native
  /**
           * Returns the origin GUID of any library node.
           * @param node the node in question.
           * @param name of the library where we want to deduct the GUID from. 
           * If not given, than the GUID is computed from the 
           * direct library root of the node
           * @return the origin GUID of the node or error if the query cannot be fulfilled.
           */
  def getLibraryGuid(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.GUID | nodeLib.Error = js.native
  /**
           * Returns the info associated with the library.
           * @param node the node in question.
           * @param name of the library.
           * @return the information object, stored alongside the library 
           * (that basically carries metaData about the library).
           */
  def getLibraryInfo(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): LibraryInfo = js.native
  /**
           * Returns all the Meta nodes within the given library. 
           * By default it will include nodes defined in any 
           * library within the given library.
           * @param node the node in question.
           * @param name of the library.
           * @param onlyOwn if true only returns with Meta nodes defined in the library itself.
           * @return an array of core nodes that are part of your meta from the given library.
           */
  def getLibraryMetaNodes(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.CoreNs.Node] = js.native
  /**
           * Returns all the Meta nodes within the given library. 
           * By default it will include nodes defined in any 
           * library within the given library.
           * @param node the node in question.
           * @param name of the library.
           * @param onlyOwn if true only returns with Meta nodes defined in the library itself.
           * @return an array of core nodes that are part of your meta from the given library.
           */
  def getLibraryMetaNodes(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, onlyOwn: scala.Boolean): js.Array[webgmeLib.CoreNs.Node] = js.native
  /**
           * Gives back the list of libraries in your project.
           * @param node the node in question.
           * @param name of the library.
           * @param onlyOwn if true only returns with Meta nodes defined in the library itself.
           * @return the fully qualified names of all the 
           * libraries in your project (even embedded ones).
           */
  def getLibraryNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * @param node the node in question.
           * @param name of the library.
           * @return the library root node or null, if the library is unknown.
           */
  def getLibraryRoot(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.Node | scala.Null = js.native
  /**
           * @param node the node in question.
           * @param setName of the set.
           * @param memberPath the absolute path of the member node.
           * @return the value of the attribute. 
           * If it is undefined, 
           * then there is no such attributed connected to the given set membership.
           */
  def getMemberAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path,
    attrName: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * @param node the node in question.
           * @param name of the set.
           * @param memberPath the absolute path of the member node.
           * @return the array of names of attributes that 
           * represents some property of the membership.
           */
  def getMemberAttributeNames(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path
  ): js.Array[java.lang.String] = js.native
  /**
           * @param node the node in question.
           * @param name of the set.
           * @param memberPath the absolute path of the member node.
           * @return the array of names of attributes that represents some property of the membership.
           */
  def getMemberOwnAttributeNames(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path
  ): js.Array[java.lang.String] = js.native
  /**
           * @param node the node in question.
           * @param name of the set.
           * @param memberPath the absolute path of the member node.
           * @param regName the name of the registry entry.
           * @return the value of the registry. 
           * If it is undefined, than there is no such registry connected to the given set membership.
           */
  def getMemberOwnRegistry(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, memberPath: java.lang.String): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * Return the names of the registry entries defined 
           * for the set membership specifically defined to the member node.
           * @param node the node in question.
           * @param name of the set.
           * @param memberPath the absolute path of the member node.
           * @return the array of names of registry entries that represents some property of the membership.
           */
  def getMemberOwnRegistryNames(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[java.lang.String] = js.native
  /**
           * Returns the list of absolute paths of the members of the given set of the given node.
           * @param node the node in question.
           * @param name of the set.
           * @return an array of absolute path strings of the member nodes of the set.
           */
  def getMemberPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[java.lang.String] = js.native
  /**
           * @param node the node in question.
           * @param setName of the set.
           * @param memberPath the absolute path of the member node.
           * @param regName the name of the registry entry.
           * @return the value of the registry. 
           * If it is undefined, then there is no such registry connected to the given set membership.
           */
  def getMemberRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: java.lang.String,
    memberPath: java.lang.String,
    regName: java.lang.String
  ): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * @param node the node in question.
           * @param name of the set.
           * @param memberPath the absolute path of the member node.
           * @return the array of names of registry entries that represents some property of the membership.
           */
  def getMemberRegistryNames(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, memberpath: java.lang.String): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Checks if the mixins allocated with the node can be used. 
           * Every mixin node should be on the Meta. 
           * Every rule (attribute/pointer/set/aspect/containment/constraint) 
           * should be defined only in one mixin.
           * @param node the node in question.
           * @return the array of violations. If the array is empty, there are no violations.
           */
  def getMixinErrors(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.CoreNs.MixinViolation] = js.native
  /**
           * Gathers the mixin nodes associated with the node.
           * @param node the node in question.
           * @return the dictionary of the mixin nodes keyed by their paths.
           */
  def getMixinNodes(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Dictionary[webgmeLib.CoreNs.Node] = js.native
  /**
           * Gathers the paths of the mixin nodes associated with the node.
           * @param node the node in question.
           * @return the paths of the mixins in an array.
           */
  def getMixinPaths(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Returns the resolved namespace for the node. 
           * If node is not in a library it returns the empty string. 
           * If the node is in a library of a library - 
           * the full name space is the library names joined together by dots.
           * @param node the node in question.
           * @return the name space of the node.
           */
  def getNamespace(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Name = js.native
  /**
           * @param node the node in question.
           * @return the value of the attribute defined specifically for the node. 
           * If undefined then it means that there is no such 
           * attribute defined directly for the node, 
           * meaning that it either inherits some value or 
           * there is no such attribute at all.
           */
  def getOwnAttribute(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * Returns the names of the attributes of the node that have 
           * been first defined for the node and not for its bases.
           * @param node the node in question.
           * @return an array of the names of the own attributes of the node.
           */
  def getOwnAttributeNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Collects the paths of all the children of the given node 
           * that has some data as well and not just inherited.
           * @param parent the node in question.
           * @return an array of the absolute paths of the children.
           */
  def getOwnChildrenPaths(parent: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Collects the relative ids of all the children 
           * of the given node that has some data and not just inherited. 
           * n.b. Do not mutate the returned array!
           * @param parent the node in question.
           * @return an array of the relative ids.
           */
  def getOwnChildrenRelids(parent: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.RelId] = js.native
  /**
           * Retrieves the list of constraint names defined specifically for the node.
           * @param node the node in question.
           * @return the array of names of constraints for the node.
           */
  def getOwnConstraintNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Returns the META rules specifically defined for the given node.
           * @param node the node in question.
           * @return an object that represent the META 
           * rules that were defined specifically for the node.
           */
  def getOwnJsonMeta(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaRules = js.native
  /**
           * Returns the list of absolute paths of the members of the 
           * given set of the given node that not simply inherited.
           * @param node the node in question.
           * @return an array of absolute path strings of the member nodes of 
           * the set that has information on the node's inheritance level.
           */
  def getOwnMemberPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Gathers the mixin nodes associated with the node that were defined specifically for the given node.
           * @param node the node in question.
           * @return the dictionary of the own mixin nodes keyed by their paths.
           */
  def getOwnMixinNodes(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Dictionary[webgmeLib.CoreNs.Node] = js.native
  /**
           * Gathers the paths of the mixin nodes associated with the node 
           * that were defined specifically for the given node.
           * @param node the node in question.
           * @return the paths of the own mixins in an array.
           */
  def getOwnMixinPaths(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Returns the list of the names of the 
           * pointers that were defined specifically for the node.
           * @param node the node in question.
           * @return an array of names of pointers defined specifically for the node.
           */
  def getOwnPointerNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Returns the absolute path of the target 
           * of the pointer specifically defined for the node.
           * @param node the node in question.
           * @param name the name of the pointer.
           * @return the absolute path. 
           * If the path is null, then it means that 'no-target' 
           * was defined specifically for this node for the pointer. 
           * If undefined it means that the node either inherits 
           * the target of the pointer or there is no pointer defined at all.
           */
  def getOwnPointerPath(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutPath = js.native
  /**
           * Returns the value of the registry entry defined for the given node.
           * @param node the node in question.
           * @param name the name of the registry entry.
           * @return the value of the registry entry defined 
           * specifically for the node. 
           * If undefined then it means that there is no such 
           * registry entry defined directly for the node, 
           * meaning that it either inherits some value 
           * or there is no such registry entry at all.
           */
  def getOwnRegistry(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * Returns the names of the registry enrties of the node 
           * that have been first defined for the node and not for its bases.
           * @param node the node in question.
           * @return the value of the registry entry defined 
           * specifically for the node. 
           * If undefined then it means that there is 
           * no such registry entry defined directly for the node, 
           * meaning that it either inherits some value 
           * or there is no such registry entry at all.
           */
  def getOwnRegistryNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Get the value of the attribute entry 
           * specifically set for the set at the node.
           * @param node the node in question.
           * @return the value of the attribute. 
           * If it is undefined, than there is no such attribute at the set.
           */
  def getOwnSetAttribute(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.OutAttr] = js.native
  /**
           * Return the names of the attribute 
           * entries specifically set for the set at the node.
           * @param node the node in question.
           * @return the array of names of attribute entries defined in the set at the node.
           */
  def getOwnSetAttributeNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Returns the names of the sets created specifically at the node. 
           * n.b. When adding a member to a set of a node, 
           * the set is automatically created at the node.
           * @param node the node in question.
           * @return an array of set names that were specifically created at the node.
           */
  def getOwnSetNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Get the value of the registry entry specifically set for the set at the node.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param regName the name of the registry entry.
           * @return the value of the registry. 
           * If it is undefined, than there is no such registry at the set.
           */
  def getOwnSetRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    regName: webgmeLib.GmeCommonNs.Name
  ): js.Array[webgmeLib.GmeCommonNs.OutAttr] = js.native
  /**
           * Return the names of the registry entries specifically set for the set at the node.
           * @param node the node in question.
           * @param setName the name of the set.
           * @return the array of names of registry entries defined in the set at the node.
           */
  def getOwnSetRegistryNames(node: webgmeLib.CoreNs.Node, setName: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Returns the list of the META defined aspect 
           * names of the node that were specifically defined for the node.
           * @param node the node in question.
           * @return the aspect names that are specifically defined for the node.
           */
  def getOwnValidAspectNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {GmeCommon.Path[]}
           */
  def getOwnValidAspectTargetPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Returns the list of the META defined attribute 
           * names of the node that were specifically defined for the node.
           * @param node the node in question.
           * @return the attribute names that are defined specifically for the node.
           */
  def getOwnValidAttributeNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @return {GmeCommon.Name[]}
           */
  def getOwnValidPointerNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @return {GmeCommon.Name[]}
           */
  def getOwnValidSetNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {GmeCommon.Path[]}
           */
  def getOwnValidTargetPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /** 
           * The parent paths are available from the node. 
           * @param node the node in question.
           * @return the parent of the node or NULL if it has no parent.
           */
  def getParent(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | scala.Null = js.native
  /**  
           * Returns the complete path of the node in the containment hierarchy. 
           * @param node the node in question.
           * @return a path string where each portion is a relative id and they are separated by '/'. 
           * The path can be empty as well if the node in question is the root itself, 
           * otherwise it should be a chain of relative ids from the root of the containment hierarchy.
           */
  def getPath(node: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.Path = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @param {Core.Node} target
           * @return {GmeCommon.MetaInfo}
           */
  def getPointerDefinitionInfo(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaInfo = js.native
  /**
           * Return a JSON representation of the META rules regarding the given pointer/set of the given node.
           * @param node the node in question.
           * @return a detailed JSON structure that represents the META rules regarding the given pointer/set of the node.
           */
  def getPointerMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.CoreNs.RelationRule = js.native
  /**
           * Retrieves a list of the defined pointer names of the node.
           * @param node the node in question.
           * @return an array of the names of the pointers of the node.
           */
  def getPointerNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Retrieves the path of the target of the given pointer of the given node.
           * @param node the node in question.
           * @return the absolute path of the target node if there is a valid target. 
           * It returns null if though the pointer is defined it does not have any valid target. 
           * Finally, it return undefined if there is no pointer defined for the node under the given name.
           */
  def getPointerPath(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutPath = js.native
  /** 
           * Get the assigned registry.
           * Retrieves the value of the given registry entry of the given node. 
           * @param node the node in question.
           * @return the value of the registry entry of the node. 
           * The value can be an object or any primitive type. 
           * If the value is undefined that means the node do not have such attribute defined. 
           * n.b. The retrieved registry value should not be modified as is - it should be copied first!!]
           */
  def getRegistry(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  /** 
           * Get the defined registry names.
           * Returns the names of the defined registry entries of the node.
           * @param node the node in question.
           * @return an array of the names of the registry entries of the node.
           */
  def getRegistryNames(node: webgmeLib.CoreNs.Node): js.Array[java.lang.String] = js.native
  /** 
           * Get the relative id.
           * Returns the parent-relative identifier of the node.
           * @param node the node in question.
           * @return the id string or return NULL and UNDEFINED if there is no such id for the node.
           */
  def getRelid(node: webgmeLib.CoreNs.Node): js.UndefOr[webgmeLib.GmeCommonNs.RelId | scala.Null] = js.native
  /**
           * Returns the root node of the containment tree that node is part of.
           * @param node the node in question.
           * @return the root of the containment hierarchy (it can be the node itself).
           */
  def getRoot(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node = js.native
  /**
           * Get the value of the attribute entry in the set.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param attrName the name of the attribute entry.
           * @return 
           */
  def getSetAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    attrName: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * Return the names of the attribute entries for the set.
           * @param node the node in question.
           * @param setName the name of the set.
           * @return the array of names of attribute entries in the set.
           */
  def getSetAttributeNames(node: webgmeLib.CoreNs.Node, setName: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @param {Core.Node} target
           * @return {GmeCommon.MetaInfo}
           */
  def getSetDefinitionInfo(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): webgmeLib.GmeCommonNs.MetaInfo = js.native
  /**
           * Returns the names of the sets of the node.
           * @param node the node in question.
           * @return an array of set names that the node has.
           */
  def getSetNames(node: webgmeLib.CoreNs.Node): js.Array[java.lang.String] = js.native
  /**
           * Get the value of the registry entry in the set.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param regName the name of the registry entry.
           * @return the value of the registry. If it is undefined, than there is no such registry at the set.
           */
  def getSetRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    regName: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.OutAttr = js.native
  /**
           * Return the names of the registry entries for the set.
           * @param node the node in question.
           * @param setName the name of the set.
           * @return the array of names of registry entries in the set.
           */
  def getSetRegistryNames(node: webgmeLib.CoreNs.Node, setName: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Returns the root of the inheritance chain (cannot be the node itself).
           * @param node the node in question.
           * @return the root of the inheritance chain of the node. 
           * If returns null, that means the node in question is the root of the chain.
           */
  def getTypeRoot(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | scala.Null = js.native
  /**
           * Returns the list of the META defined aspect names of the node.
           * @param node the node in question.
           * @return all the aspect names that are defined among the META rules of the node.
           */
  def getValidAspectNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {GmeCommon.Path[]}
           */
  def getValidAspectTargetPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Returns the list of the META defined attribute names of the node.
           * @param node the node in question.
           * @return all the attribute names that are defined among the META rules of the node.
           */
  def getValidAttributeNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Retrieves the valid META nodes that can be base of a child of the node.
           * @param node the node in question.
           * @return a list of valid nodes that can be instantiated as a child of the node.
           */
  def getValidChildrenMetaNodes(parameters: MetaNodeParameters): js.Array[webgmeLib.CoreNs.Node] = js.native
  /**
           * Returns the list of absolute path of the valid children types of the node.
           * @param node the node in question.
           * @return an array of absolute paths of the nodes 
           * that was defined as valid children for the node.
           */
  def getValidChildrenPaths(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Returns the list of the META defined pointer names of the node.
           * @param node the node in question.
           * @return all the pointer names that are defined among the META rules of the node.
           */
  def getValidPointerNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * Retrieves the valid META nodes that can be base of a member of the set of the node.
           * @param parameters 
           * @return a list of valid nodes that can be instantiated as a member of the set of the node.
           */
  def getValidSetMetaNodes(parameters: MetaSetParameters): js.Array[webgmeLib.CoreNs.Node] = js.native
  /**
           * Returns the list of the META defined set names of the node.
           * @param node the node in question.
           * @return all the set names that are defined among the META rules of the node.
           */
  def getValidSetNames(node: webgmeLib.CoreNs.Node): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} name
           * @return {GmeCommon.Path[]}
           */
  def getValidTargetPaths(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  /**
           * Checks if the node is abstract.
           * @param node the node in question.
           * @return true if the registry entry 'isAbstract' of the node if true hence the node is abstract.
           */
  def isAbstract(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /** 
           * Check is the node is a connection-like node.
           * Connections are just nodes with two pointers named "src" and "dst". 
           * @param node the node in question.
           * @return true if both the 'src' and 'dst' pointer are defined as valid for the node.
           */
  def isConnection(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if the node in question has some actual data.
           * @param node the node in question.
           * @return true if the node is 'empty' meaning that it is not reserved by real data. 
           *  false if the node is exists and have some meaningful value.
           */
  def isEmpty(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if the member is completely overridden in the set of the node.
           * @param node the node in question.
           * @param setName the name of the set.
           * @param memberPath the absolute path to the set member.
           * @return true if the member exists in the base of the set, 
           * but was added to the given set as well, which means a complete override. 
           * If the set does not exist or the member do not have 
           * a 'base' member or just some property was overridden, the function returns false.
           */
  def isFullyOverriddenMember(
    node: webgmeLib.CoreNs.Node,
    setName: webgmeLib.GmeCommonNs.Name,
    memberPath: webgmeLib.GmeCommonNs.Path
  ): scala.Boolean = js.native
  /**
           * Checks if the node is an instance of base.
           * @param node the node in question.
           * @param type a candidate base node.
           * @return true if the base is on the inheritance chain of node.
           * A node is considered to be an instance of itself here.
           */
  def isInstanceOf(node: webgmeLib.CoreNs.Node, base: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Returns true if the node in question is a library element.
           * @param node the node in question.
           * @return true if your node is a library element, false otherwise.
           */
  def isLibraryElement(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Returns true if the node in question is a library root.
           * @param node the node in question.
           * @return true if your node is a library root 
           * (even if it is embedded in other library), false otherwise.
           */
  def isLibraryRoot(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Returns all membership information of the given node.
           * @param node the node in question.
           * @return a dictionary where every the key of every entry is an absolute path of a set owner node. 
           * The value of each entry is an array with the set names in which the node can be found as a member.
           */
  def isMemberOf(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.DataObject = js.native
  /**
           * Checks if the node is a META node.
           * @param node the node in question.
           * @return true if the node is a member of the 
           * METAAspectSet of the ROOT node hence can be seen as a META node.
           */
  def isMetaNode(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if the given node in any way inherits from the typeNode. In addition to checking if the node
           * "isInstanceOf" of typeNode, this methods also takes mixins into account.
           * @param node the node in question.
           * @param type a candidate base node.
           * @return true if the type is in the inheritance chain of the node or false otherwise. 
           * Every node is type of itself.
           */
  def isTypeOf(node: webgmeLib.CoreNs.Node, `type`: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {Core.Node} parent
           * @param {GmeCommon.Name} name
           * @return {boolean}
           */
  def isValidAspectMemberOf(node: webgmeLib.CoreNs.Node, parent: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): scala.Boolean = js.native
  /**
           * Checks if the given value is of the necessary type, according to the META rules.
           * @param node the node in question.
           * @param name the name of the attribute.
           * @param value the value for the attribute.
           * @return 
           */
  def isValidAttributeValueOf(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, value: webgmeLib.GmeCommonNs.InAttr): scala.Boolean = js.native
  /**
           * Checks if according to the META rules the given node can be a child of the parent.
           * @param node the node in question.
           * @return true if according to the META rules the node can be a child of the parent. 
           * The check does not cover multiplicity 
           * (so if the parent can only have two children and it already has them, 
           * this function will still returns true).
           */
  def isValidChildOf(node: webgmeLib.CoreNs.Node, parent: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if base can be the new base of node.
           * @param node the node in question.
           * @param base the new base node.
           * @return true if the supplied base is a valid base for the node.
           */
  def isValidNewBase(node: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if base can be the new base of node.
           * @param node the node in question.
           * @param base the new base node.
           * @return true if the supplied base is a valid base for the node.
           */
  def isValidNewBase(node: webgmeLib.CoreNs.Node, base: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Checks if parent can be the new parent of node.
           * @param node the node in question.
           * @param parent the new parent.
           * @return true if the supplied parent is a valid parent for the node.
           */
  def isValidNewParent(node: webgmeLib.CoreNs.Node, parent: webgmeLib.CoreNs.Node): scala.Boolean = js.native
  /**
           * Returns the list of the META defined pointers of the node.
           * @param node the node in question.
           * @param source the source node to test.
           * @return  true if according to the META rules, 
           * the given node is a valid target of the given pointer of the source.
           */
  def isValidTargetOf(node: webgmeLib.CoreNs.Node, source: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): scala.Boolean = js.native
  /**
           * From the given starting node, it loads the path 
           * given as a series of relative ids (separated by '/') and returns the node it finds at the ends of the path. 
           * If there is no node, the function will return null.
           * @param startNode the starting node of our search.
           * @param relativePath the relative path - built by relative ids - of the node in question.
           */
  def loadByPath(startNode: webgmeLib.CoreNs.Node, relativePath: webgmeLib.GmeCommonNs.Path): stdLib.Promise[webgmeLib.GmeCommonNs.DataObject] = js.native
  /**
           * From the given starting node, it loads the path 
           * given as a series of relative ids (separated by '/') and returns the node it finds at the ends of the path. 
           * If there is no node, the function will return null.
           * @param startNode the starting node of our search.
           * @param relativePath the relative path - built by relative ids - of the node in question.
           */
  def loadByPath(
    startNode: webgmeLib.CoreNs.Node,
    relativePath: webgmeLib.GmeCommonNs.Path,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.DataObject]
  ): scala.Unit = js.native
  /**
           * Loads the child of the given parent pointed by the relative id. 
           * Behind the scenes, it means that it actually loads the 
           * data pointed by a hash stored inside the parent under 
           * the given id and wraps it in a node object which will 
           * be connected to the parent as a child in the containment hierarchy. 
           * If there is no such relative id reserved, the call will return with null.
           * @param parent the container node in question.
           * @param relativeId the relative id of the child in question.
           */
  def loadChild(parent: webgmeLib.CoreNs.Node, relativeId: java.lang.String): stdLib.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  /**
           * Loads the child of the given parent pointed by the relative id. 
           * Behind the scenes, it means that it actually loads the 
           * data pointed by a hash stored inside the parent under 
           * the given id and wraps it in a node object which will 
           * be connected to the parent as a child in the containment hierarchy. 
           * If there is no such relative id reserved, the call will return with null.
           * @param parent the container node in question.
           * @param relativeId the relative id of the child in question.
           */
  def loadChild(
    parent: webgmeLib.CoreNs.Node,
    relativeId: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
  /**
           * Loads all the children of the given parent. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           * @see https://github.com/webgme/webgme/wiki/GME-Core-API#containment-methods
           */
  def loadChildren(parent: webgmeLib.CoreNs.Node): stdLib.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  /**
           * Loads all the children of the given parent. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           * @see https://github.com/webgme/webgme/wiki/GME-Core-API#containment-methods
           */
  def loadChildren(
    parent: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
  /**
           * Loads all the source nodes that has such a pointer and its target is the given node.
           * @param target the container node in question.
           * @param pointerName 
           * @return the relative id of the child in question.
           */
  def loadCollection(target: webgmeLib.CoreNs.Node, pointerName: webgmeLib.GmeCommonNs.Name): stdLib.Promise[js.Array[webgmeLib.GmeCommonNs.DataObject]] = js.native
  /**
           * Loads all the source nodes that has such a pointer and its target is the given node.
           * @param target the container node in question.
           * @param pointerName 
           * @return the relative id of the child in question.
           */
  def loadCollection(
    target: webgmeLib.CoreNs.Node,
    pointerName: webgmeLib.GmeCommonNs.Name,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.DataObject]]
  ): scala.Unit = js.native
  /**
           * Loads all the instances of the given node.
           * @param node the node in question.
           */
  def loadInstances(node: webgmeLib.CoreNs.Node): stdLib.Promise[scala.Unit] = js.native
  /**
           * Loads all the instances of the given node.
           * @param node the node in question.
           */
  def loadInstances(node: webgmeLib.CoreNs.Node, callback: webgmeLib.GmeCommonNs.ErrorOnlyCallback): scala.Unit = js.native
  /**
           * Loads all the children of the given parent that has some data and not just inherited. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           */
  def loadOwnChildren(parent: webgmeLib.CoreNs.Node): stdLib.Promise[scala.Unit] = js.native
  /**
           * Loads all the children of the given parent that has some data and not just inherited. 
           * As it first checks the already reserved relative ids of the parent, 
           * it only loads the already existing children (so no on-demand empty node creation).
           * @param parent the container node in question.
           */
  def loadOwnChildren(parent: webgmeLib.CoreNs.Node, callback: webgmeLib.GmeCommonNs.ErrorOnlyCallback): scala.Unit = js.native
  /**
           * Loads a complete sub-tree of the containment hierarchy starting from the given node, 
           * but load only those children that has some additional data and not purely inherited.
           * @param node the node in question.
           */
  def loadOwnSubTree(node: webgmeLib.CoreNs.Node): stdLib.Promise[scala.Unit] = js.native
  /**
           * Loads a complete sub-tree of the containment hierarchy starting from the given node, 
           * but load only those children that has some additional data and not purely inherited.
           * @param node the node in question.
           */
  def loadOwnSubTree(node: webgmeLib.CoreNs.Node, callback: webgmeLib.GmeCommonNs.ErrorOnlyCallback): scala.Unit = js.native
  /**
           * Loads the target of the given pointer of the given node. 
           * In the callback the node can have three values: 
           * if the node is valid, then it is the defined target of a valid pointer, 
           * if the returned value is null, then it means that the pointer is defined, but has no real target, 
           * finally if the returned value is undefined then there is no such pointer defined for the given node.
           * @param source the source node in question.
           * @param pointerName the relative id of the child in question.
           */
  def loadPointer(source: webgmeLib.CoreNs.Node, pointerName: java.lang.String): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * Loads the target of the given pointer of the given node. 
           * In the callback the node can have three values: 
           * if the node is valid, then it is the defined target of a valid pointer, 
           * if the returned value is null, then it means that the pointer is defined, but has no real target, 
           * finally if the returned value is undefined then there is no such pointer defined for the given node.
           * @param source the source node in question.
           * @param pointerName the relative id of the child in question.
           */
  def loadPointer(
    source: webgmeLib.CoreNs.Node,
    pointerName: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * Loads the data object with the given hash and makes it a root of a containment hierarchy.
           * @param node the node in question.
           * @return 
           */
  def loadRoot(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * Loads the data object with the given hash and makes it a root of a containment hierarchy.
           * @param node the node in question.
           * @return 
           */
  def loadRoot(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def loadSubTree(node: webgmeLib.CoreNs.Node): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def loadSubTree(
    node: webgmeLib.CoreNs.Node,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def loadTree(rootHash: webgmeLib.GmeCommonNs.MetadataHash): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def loadTree(
    rootHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {Core.Node} target
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def moveAspectMetaTarget(
    node: webgmeLib.CoreNs.Node,
    target: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Path} memberPath
           * @param {GmeCommon.Name} oldSetName
           * @param {GmeCommon.Name} newSetName
           * @return {Error}
           */
  def moveMember(
    node: webgmeLib.CoreNs.Node,
    memberPath: webgmeLib.GmeCommonNs.Path,
    oldSetName: webgmeLib.GmeCommonNs.Name,
    newSetName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def moveNode(node: webgmeLib.CoreNs.Node, parent: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.Node | nodeLib.Error = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {Core.Node} target
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def movePointerMetaTarget(
    node: webgmeLib.CoreNs.Node,
    target: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def persist(node: webgmeLib.CoreNs.Node): webgmeLib.CoreNs.GmePersisted = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def removeLibrary(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): scala.Unit = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def renameAttribute(
    node: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def renameAttributeMeta(
    node: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def renameLibrary(node: webgmeLib.CoreNs.Node, oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def renamePointer(
    node: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def renameRegistry(
    node: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param {Core.Node} node
           * @param {GmeCommon.Name} oldName
           * @param {GmeCommon.Name} newName
           * @return {Error}
           */
  def renameSet(
    node: webgmeLib.CoreNs.Node,
    oldName: webgmeLib.GmeCommonNs.Name,
    newName: webgmeLib.GmeCommonNs.Name
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setAspectMetaTarget(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setAttribute(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, value: webgmeLib.GmeCommonNs.InAttr): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setAttributeMeta(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, rule: MetaRule): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setBase(node: webgmeLib.CoreNs.Node, base: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildMeta(node: webgmeLib.CoreNs.Node, child: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildMeta(node: webgmeLib.CoreNs.Node, child: webgmeLib.CoreNs.Node, min: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildMeta(node: webgmeLib.CoreNs.Node, child: webgmeLib.CoreNs.Node, min: scala.Double, max: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildrenMetaLimits(node: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildrenMetaLimits(node: webgmeLib.CoreNs.Node, min: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setChildrenMetaLimits(node: webgmeLib.CoreNs.Node, min: scala.Double, max: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setConstraint(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    constraint: webgmeLib.CoreNs.Constraint
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setGuid(node: webgmeLib.CoreNs.Node, guid: webgmeLib.CoreNs.GUID): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setGuid(
    node: webgmeLib.CoreNs.Node,
    guid: webgmeLib.CoreNs.GUID,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setMemberAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: java.lang.String,
    memberPath: java.lang.String,
    SVGPathSegLinetoHorizontalAbsme: java.lang.String
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setMemberAttribute(
    node: webgmeLib.CoreNs.Node,
    setName: java.lang.String,
    memberPath: java.lang.String,
    SVGPathSegLinetoHorizontalAbsme: java.lang.String,
    value: webgmeLib.GmeCommonNs.InAttr
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setMemberRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: java.lang.String,
    memberPath: java.lang.String,
    regName: java.lang.String
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setMemberRegistry(
    node: webgmeLib.CoreNs.Node,
    setName: java.lang.String,
    memberPath: java.lang.String,
    regName: java.lang.String,
    value: webgmeLib.GmeCommonNs.InAttr
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointer(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointer(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaLimits(node: webgmeLib.CoreNs.Node, memberPath: java.lang.String): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaLimits(node: webgmeLib.CoreNs.Node, memberPath: java.lang.String, min: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaLimits(node: webgmeLib.CoreNs.Node, memberPath: java.lang.String, min: scala.Double, max: scala.Double): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaTarget(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, target: webgmeLib.CoreNs.Node): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaTarget(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    target: webgmeLib.CoreNs.Node,
    min: scala.Double
  ): js.UndefOr[nodeLib.Error] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def setPointerMetaTarget(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    target: webgmeLib.CoreNs.Node,
    min: scala.Double,
    max: scala.Double
  ): js.UndefOr[nodeLib.Error] = js.native
  /** 
           * TODO
           * Get the assigned registry 
           * @param node the node in question.
           * @return 
           */
  def setRegistry(node: webgmeLib.CoreNs.Node, name: webgmeLib.GmeCommonNs.Name, value: webgmeLib.GmeCommonNs.InAttr): js.UndefOr[nodeLib.Error] = js.native
  // takes *no* callback & returns a promise
  /**
           * TODO
           * the visitation function will be called for
           * every node in the sub-tree, the second parameter of the function
           * is a callback that should be called to
           * note to the traversal function that the visitation for a given node is finished.
           *  @param node the node in question.
          * @return 
           */
  def traverse(
    node: webgmeLib.CoreNs.Node,
    options: TraversalOptions,
    visitFn: js.Function2[
      /* node */ webgmeLib.CoreNs.Node, 
      /* finished */ webgmeLib.GmeCommonNs.VoidFn, 
      scala.Unit
    ]
  ): stdLib.Promise[scala.Unit] = js.native
  // takes a callback & returning *no* promise
  /**
           * TODO
           * the visitation function will be called for
           * every node in the sub-tree, the second parameter of the function
           * is a callback that should be called to
           * note to the traversal function that the visitation for a given node is finished.
           *  @param node the node in question.
          * @return 
           */
  def traverse(
    node: webgmeLib.CoreNs.Node,
    options: TraversalOptions,
    visitFn: js.Function2[
      /* node */ webgmeLib.CoreNs.Node, 
      /* finished */ webgmeLib.GmeCommonNs.VoidFn, 
      scala.Unit
    ],
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def tryToConcatChanges(mine: webgmeLib.CoreNs.DataObject, theirs: webgmeLib.CoreNs.DataObject): webgmeLib.CoreNs.DataObject = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def updateLibrary(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: webgmeLib.GmeCommonNs.MetadataHash,
    libraryInfo: LibraryInfo
  ): stdLib.Promise[webgmeLib.CoreNs.DataObject] = js.native
  /**
           * TODO
           * @param node the node in question.
           * @return 
           */
  def updateLibrary(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: webgmeLib.GmeCommonNs.MetadataHash,
    libraryInfo: LibraryInfo,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

