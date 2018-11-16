package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a package storage volume. */
@JSGlobal("Windows.Management.Deployment.PackageVolume")
@js.native
class PackageVolume () extends js.Object {
  /** Describes whether a volume is in an offline state. */
  var isOffline: scala.Boolean = js.native
  /** Describes whether a volume is an internal system volume mapped to the %SYSTEMDRIVER% environment variable. */
  var isSystemVolume: scala.Boolean = js.native
  /** Gets the path of the last known volume mount point. */
  var mountPoint: java.lang.String = js.native
  /** Gets the media ID of the volume. */
  var name: java.lang.String = js.native
  /** Gets the absolute path for the package store on the volume. */
  var packageStorePath: java.lang.String = js.native
  /** Gets a value that specifies whether the volume supports the creation of hard links in its file system. */
  var supportsHardLinks: scala.Boolean = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package for all registered users.
                   * @param packageFullName The full name of the package.
                   * @return A collection of info about all installed instances of the specified package for all registered users.
                   */
  def findPackage(packageFullName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about the installed instances of the specified package for the specified user or users.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageFullName The full name of the package.
                   * @return A collection of info about all installed instances of the specified package for the specified user or users.
                   */
  def findPackageForUser(userSecurityId: java.lang.String, packageFullName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of all packages for all registered users.
                   * @return A collection of info about the specified packages.
                   */
  def findPackages(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package for all registered users.
                   * @param packageFamilyName The package family name of the package.
                   * @return A collection of info about the specified packages.
                   */
  def findPackages(packageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package from the specified publisher for all registered users.
                   * @param packageName The full name of the package.
                   * @param packagePublisher The publisher of the package.
                   * @return A collection of info about the specified packages.
                   */
  def findPackages(packageName: java.lang.String, packagePublisher: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of all packages for the specified user or users.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUser(userSecurityId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package for the specified user or users.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageFamilyName The package family name.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUser(userSecurityId: java.lang.String, packageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package from the specified publisher for the specified user or users.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageName The full name of the package.
                   * @param packagePublisher The publisher of the package.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUser(
    userSecurityId: java.lang.String,
    packageName: java.lang.String,
    packagePublisher: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of all packages for the specified user or users and with the specified package types.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUserWithPackageTypes(userSecurityId: java.lang.String, packageTypes: PackageTypes): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package for the specified user or users and with the specified package types.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @param packageFamilyName The package family name.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUserWithPackageTypes(userSecurityId: java.lang.String, packageTypes: PackageTypes, packageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package for the specified user or users and with the specified package types.
                   * @param userSecurityId The security identifier (SID) of the user or users. An empty string denotes the current user. The Everyone SID (S-1-1-0) denotes all users. Any SID other than that of the current user requires administrative privileges.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @param packageName The full name of the package.
                   * @param packagePublisher The publisher of the package.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesForUserWithPackageTypes(
    userSecurityId: java.lang.String,
    packageTypes: PackageTypes,
    packageName: java.lang.String,
    packagePublisher: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of all packages with the specified package types for all registered users.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesWithPackageTypes(packageTypes: PackageTypes): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package with the specified package types for all registered users.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @param packageFamilyName The package family name.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesWithPackageTypes(packageTypes: PackageTypes, packageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
  /**
                   * Gets a collection of info about all installed instances of the specified package from the specified publisher with the specified package types for all registered users.
                   * @param packageTypes A bitwise combination of the enumeration values that specifies the types of packages to return.
                   * @param packageName The full name of the package.
                   * @param packagePublisher The publisher of the package.
                   * @return A collection of info about the specified packages.
                   */
  def findPackagesWithPackageTypes(packageTypes: PackageTypes, packageName: java.lang.String, packagePublisher: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package] = js.native
}

